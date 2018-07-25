package WorkingWithLists.P17

object P17 {
  def split[T](n: Int, l: List[T]): (List[T], List[T]) =
    (l.take(n), l.drop(n))

  def split_TailRecursion[T](n: Int, l: List[T]): (List[T], List[T]) = {
    def _split[T](i: Int, prev: List[T], next: List[T]): (List[T], List[T]) = next match {
      case h::tail if i != n => _split(i+1, h::prev, tail)
      case _ => (prev.reverse, next)
    }
    _split(0, Nil, l)
  }
}
