object P08 extends App {
  def compress[T](l: List[T]): List[T] = {
    def _compress[T](prev: List[T], next: List[T], prevElem: T): List[T] = next match {
      case Nil => prev
      // List appending costs much more time than prepending
      case h::nnext => if (h == prevElem) _compress(prev, nnext, prevElem)
                       else _compress(prev:::List(h), nnext, h)
    }
    if (l == Nil) Nil
    else _compress(List(l.head), l.tail, l.head)
  }

  // use prepend rather than append when deal with List concating
  def compress2[T](l: List[T]): List[T] = {
    def _compress[T](prev: List[T], next: List[T]): List[T] = next match {
      case Nil => prev.reverse
      case h::nnext => _compress(h::prev, nnext.dropWhile(_ == h))
    }
    _compress(Nil, l)
  }

  def compressFP[T](l: List[T]): List[T] =
    l.foldLeft(List[T]()) { (lc, e) =>
      if (lc.isEmpty || lc.head != e) e :: lc
      else lc
    }.reverse

  println("compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println("compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    compress2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println("compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    compressFP(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
