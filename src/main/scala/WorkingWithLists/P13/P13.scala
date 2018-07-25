package WorkingWithLists.P13

object P13 {
  def encodeDirect[T](l: List[T]): List[(Int, T)] = {
    def _encodeDirect[T](prev: List[(Int, T)], next: List[T]): List[(Int, T)] = next match {
      case Nil => prev.reverse
      // more elegant using prefixLength + drop instead of takeWhile + dropWhile
      case h::tail => {
        val len = next.prefixLength(_ == h)
        _encodeDirect((len, h)::prev, next.drop(len))
      }
//      case h::tail => _encodeDirect((next.takeWhile(_ == h).length, h)::prev, next.dropWhile(_ == h))
    }
    _encodeDirect(Nil, l)
  }

  def encodeDirect_FoldRight[T](l: List[T]): List[(Int, T)] = l.foldRight(List[(Int, T)]()) {
    (e, ll) => ll match {
      case pair::tail if pair._2 == e => (pair._1 + 1, pair._2)::tail
      case _ => (1, e)::ll
    }
  }
}
