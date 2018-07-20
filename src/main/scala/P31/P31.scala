package P31

import scala.language.implicitConversions

class P31(val num: Int) {
  def isPrime: Boolean = (P31.primeStream dropWhile (_ < num)).head == num
}

object P31 {
  implicit def toP31Int(num: Int): P31 = new P31(num)

  def filter(stream: Stream[Int]): Stream[Int] =
    stream.head #:: filter(stream filter (_  % stream.head != 0))
  val primeStream = filter(Stream.from(2))
}
