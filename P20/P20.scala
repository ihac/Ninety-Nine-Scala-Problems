object P20 extends App {
  def removeAt[T](n: Int, l: List[T]): (List[T], T) = {
    def _removeAt[T](prev: List[T], next: List[T], idx: Int): (List[T], T) = (next, idx) match {
      case (Nil, _) => throw new NoSuchElementException
      case (e::tail, x) if x == n => ((prev.reverse):::tail, e)
      case (e::tail, x) => _removeAt(e::prev, tail, x+1)
    }
    _removeAt(List[T](), l, 0)
  }

  def removeAtFP[T](n: Int, l: List[T]): (List[T], T) =
    if (n < 0 || n >= l.length) throw new NoSuchElementException
    else (l.take(n) ::: l.drop(n + 1), l(n))

  def removeAt2[T](n: Int, l: List[T]): (List[T], T) = l.splitAt(n) match {
    case (_, Nil) => throw new NoSuchElementException
    case (Nil, _) if (n < 0) => throw new NoSuchElementException
    case (prev, h::tail) => (prev:::tail, h)
  }

  println("removeAt(1, List('a, 'b, 'c, 'd)) = " +
    removeAt(1, List('a, 'b, 'c, 'd)))
  println("removeAt(1, List('a, 'b, 'c, 'd)) = " +
    removeAtFP(1, List('a, 'b, 'c, 'd)))
  println("removeAt(1, List('a, 'b, 'c, 'd)) = " +
    removeAt2(1, List('a, 'b, 'c, 'd)))
}
