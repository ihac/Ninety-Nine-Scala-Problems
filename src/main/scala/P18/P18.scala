package P18

object P18 {
  def slice[T](i: Int, k: Int, l: List[T]): List[T] =
    // be careful that i might be less than 0
    l.drop(i).take(k - (i max 0))

  def slice_TailRecursion[T](i: Int, k: Int, l: List[T]): List[T] = {
    def _slice[T](idx: Int, prev: List[T], next: List[T]): List[T] = next match {
      case h::tail if idx >= i && idx < k => _slice(idx+1, h::prev, tail)
      case h::tail if idx < i => _slice(idx+1, prev, tail)
      case _ => prev.reverse
    }
    _slice(0, Nil, l)
  }
}
