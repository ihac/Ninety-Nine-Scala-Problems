package P34

import scala.language.implicitConversions

class P34(val num: Int) {
  import P33.P33._
  def totient: Int = (1 to num) count (_ isCoprimeTo num)
}

object P34 {
  implicit def toP34Int(num: Int): P34 = new P34(num)
}
