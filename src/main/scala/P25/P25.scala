package P25

import P23._
import P20._

object P25 {
  def randomPermute[T](l: List[T]): List[T] = P23.randomSelect(l.length, l)

  def randomPermute_TailRecursion[T](l: List[T]): List[T] = {
    def _randomPermute[T](prev: List[T], rem: List[T]): List[T] = rem match {
      case Nil => prev
      case _ => {
        val (rest, e) = P20.removeAt(scala.util.Random.nextInt(rem.length), rem)
        _randomPermute(e::prev, rest)
      }
    }
    _randomPermute(Nil, l)
  }
}
