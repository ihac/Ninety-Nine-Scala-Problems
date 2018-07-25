package Arithmetic.P31

import scala.language.implicitConversions

class P31(val num: Int) {
  def isPrime: Boolean =
    num >= 2 && (P31.primeStream takeWhile (_ <= Math.sqrt(num)) forall (num % _ != 0))
}

object P31 {
  implicit def toP31Int(num: Int): P31 = new P31(num)

  def loop(stream: Stream[Int]): Stream[Int] =
    stream.head #:: loop(stream filter (_ % stream.head != 0))
  val primeStream: Stream[Int] = loop(Stream.from(2))
}
