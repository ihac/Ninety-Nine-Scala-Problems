package P40

import scala.language.implicitConversions

class P40(val num: Int) {
  require(num > 2 && num % 2 == 0)
  import P31.P31._
  def goldbach: (Int, Int) = {
    primeStream takeWhile { _ <= num / 2 } find { n =>
      (num - n).isPrime
    } match {
      case Some(a) => (a, num - a)
      case None    => (-1, -1) // not found
    }
  }
}

object P40 {
  implicit def toP40Int(num: Int): P40 = new P40(num)
}
