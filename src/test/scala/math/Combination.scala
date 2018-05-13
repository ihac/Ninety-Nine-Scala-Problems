package math

object Combination {
  def compute(n: Int, k: Int): Long =
    if (!(n > 0 && k >= 0 && n >= k)) throw new IllegalArgumentException
    else n match {
      case 1 => 1 // k must equal to 1 or 0
      case _ if k == 0 || k == n => 1
      case _ => compute(n-1, k) + compute(n-1, k-1)
    }
}
