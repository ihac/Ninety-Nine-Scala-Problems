package WorkingWithLists.P09

object P09 {
  def pack[T](l: List[T]): List[List[T]] = l.foldRight(List[List[T]]()) {
    case (e, h::ls) if e == h.head => (e::h)::ls
    case (e, ll) => List(e)::ll
  }

  def pack_TailRecursion[T](l: List[T]): List[List[T]] = {
    def _pack(prev: List[List[T]], next: List[T]): List[List[T]] = next match {
      case Nil => prev.reverse
      // more effective using takeWhile + dropWhile
      case h::ls => _pack(next.takeWhile(_ == h)::prev, next.dropWhile(_ == h))
//      case h::ls =>
//        if (!prev.isEmpty && prev.head.head == h) _pack((h::prev.head)::prev.tail, ls)
//        else _pack(List(h)::prev, ls)
    }
    _pack(Nil, l)
  }
}
