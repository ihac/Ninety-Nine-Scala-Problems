package P36

import scala.language.implicitConversions

class P36(val num: Int) {
  def primeFactorMultiplicity: List[(Int, Int)] = {
    import P35.P35._
    import P09.P09._
    pack(num.primeFactors) map {l => (l.head, l.length)}
  }

  def primeFactorMultiplicity_Direct: List[(Int, Int)] = {
    def helper(n: Int, f: Int, cnt: Int): (Int, Int) = {
      require(f > 0 && n > 0)
      if (n % f == 0) helper(n / f, f, cnt + 1)
      else (n, cnt)
    }

    import P31.P31._
    def _primeFactorMultiplicity(n: Int, s: Stream[Int], prev: List[(Int, Int)]): List[(Int, Int)] = {
      if (n < 2) Nil
      else if (n.isPrime) ((n, 1) :: prev).reverse
      else if (n % s.head == 0) {
        val (rem, cnt) = helper(n, s.head, 0)
        _primeFactorMultiplicity(rem, s.tail, (s.head, cnt) :: prev)
      }
      else _primeFactorMultiplicity(n, s.tail, prev)
    }
    _primeFactorMultiplicity(num, primeStream, Nil)
  }
}

object P36 {
  implicit def toP36Int(num: Int): P36 = new P36(num)
}
