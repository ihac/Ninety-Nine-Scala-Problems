package P33

import scala.language.implicitConversions

class P33(val num: Int) {
  import P32._
  def isCoprimeTo(other: Int): Boolean = P32.gcd(num, other) == 1
}

object P33 {
  implicit def toP33Int(num: Int): P33 = new P33(num)
}
