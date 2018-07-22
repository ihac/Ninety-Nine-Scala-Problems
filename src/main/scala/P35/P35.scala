package P35

import scala.language.implicitConversions

class P35(val num: Int) {
  def primeFactors: List[Int] = {
    import P31.P31._
    def _primeFactors(s: Stream[Int], prev: List[Int], n: Int): List[Int] =
      if (n < 2) Nil
      else if (n.isPrime) (n :: prev).reverse
      else if (n % s.head == 0) _primeFactors(s, s.head :: prev, n / s.head)
      else _primeFactors(s.tail, prev, n)
    _primeFactors(P35.primeStream, Nil, num)
  }
}

object P35 {
  implicit def toP35Int(num: Int): P35 = new P35(num)

  def loop(st: Stream[Int]): Stream[Int] =
    st.head #:: loop(st.tail filter (_ % st.head != 0))
  val primeStream: Stream[Int] = loop(Stream.from(2))
}

