object P18 extends App {
  def slice[T](start: Int, end: Int, l: List[T]): List[T] = {
    def _slice[T](res: List[T], next: List[T], idx: Int): List[T] = (next, idx) match {
      case (Nil, _) => res.reverse
      case (h::tail, x) =>
        if (x >= end) res.reverse
        else if (x >= start) _slice(h::res, tail, x+1)
        else _slice(res, tail, x+1)
    }
    _slice(List[T](), l, 0)
  }
  def sliceFP[T](start: Int, end: Int, l: List[T]): List[T] =
    l drop start take (end - (start max 0))
  println("slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = " +
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
