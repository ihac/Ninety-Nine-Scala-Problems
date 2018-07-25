package WorkingWithLists.P23

import WorkingWithLists.P20._

object P23 {
  def randomSelect[T](n: Int, l: List[T]): List[T] = {
    def _randomSelect[T](num: Int, res: List[T], ll: List[T]): List[T] = {
      if (num >= n) res
      else ll match {
        case h::tail => {
          val (rest, e) = P20.removeAt(scala.util.Random.nextInt(ll.length), ll)
          _randomSelect(num+1, e::res, rest)
        }
        case _ => res
      }
    }
    _randomSelect(0, Nil, l)
  }
}
