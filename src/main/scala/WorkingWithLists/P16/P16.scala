package WorkingWithLists.P16

object P16 {
  def drop[T](n: Int, l: List[T]): List[T] = {
    def _drop[T](i: Int, prev: List[T], next: List[T]): List[T] = next match {
      case Nil => prev.reverse
      case h::tail =>
        if (i == n) _drop(1, prev, tail)
        else _drop(i+1, h::prev, tail)
    }
    _drop(1, Nil, l)
  }

  def drop_FP[T](n: Int, l: List[T]): List[T] =
    l.zipWithIndex.filter(
      p => (p._2 + 1) % n != 0
    ).map(_._1)
}
