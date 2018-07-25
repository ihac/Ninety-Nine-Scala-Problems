package Arithmetic.P32

object P32 {
  def gcd(a: Int, b: Int): Int =
    if (a == 0) b else gcd(b % a, a)
}
