package WorkingWithLists.P08

object P08 {
  def compress[T](l: List[T]): List[T] = l.foldRight(List[T]()) {
    (e, ll) => ll match {
      case head::_ if head == e => ll
      case _ => e::ll
    }
  }

  // use prepend rather than append when deal with List concatenating
  def compress_TailRecursion[T](l: List[T]): List[T] = {
    def _compress[T](orig: List[T], newl: List[T]): List[T] = (orig, newl) match {
      case (Nil, _) => newl.reverse
      // more effective using dropWhile
      case (oh::ol, _) => _compress(orig.dropWhile(_ == oh), oh::newl)
//      case (oh::ol, nh::_) if (oh == nh) => _compress(ol, newl)
//      case (oh::ol, _) => _compress(ol, oh::newl)
    }
    _compress(l, Nil)
  }
}
