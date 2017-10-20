object P11 extends App {
  def encodeModified[T](l: List[T]): List[Any] = {
    def pack[T](l: List[T]): List[List[T]] = {
      def _pack(lp: List[List[T]], lrem: List[T]): List[List[T]] = lrem match {
        case Nil => lp.reverse
        case h::tail => _pack(lrem.takeWhile(_ == h)::lp, lrem.dropWhile(_ == h))
      }
      _pack(Nil, l)
    }
    pack(l) map {
      case e::Nil => e
      case lp => (lp.length, lp.head)
    }
  }
  println("encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
