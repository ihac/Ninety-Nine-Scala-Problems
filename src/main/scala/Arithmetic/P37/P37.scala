package Arithmetic.P37

import scala.language.implicitConversions
import scala.math.pow

class P37(val num: Int) {
  import Arithmetic.P36.P36._
  def totient_improve: Int = (num.primeFactorMultiplicity foldLeft 1) {
    (acc, pair) =>
      acc * (pair._1 - 1) * pow(pair._1, pair._2 - 1).toInt
  }
}

object P37 {
  implicit def toP37Int(num: Int): P37 = new P37(num)
}
