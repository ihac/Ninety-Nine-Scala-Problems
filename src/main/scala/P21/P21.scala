package P21

object P21 {
  def insertAt[T](e: T, n: Int, l: List[T]): List[T] =
    l.take(n):::(e::l.drop(n))

  def insertAt_Split[T](e: T, n: Int, l: List[T]): List[T] = l.splitAt(n) match {
    case (prev, next) => prev:::(e::next)
  }
}
