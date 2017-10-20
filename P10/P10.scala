object P10 extends App {
  def pack[T](l: List[T]): List[List[T]] = {
    def _pack(lp: List[List[T]], lrem: List[T]): List[List[T]] = lrem match {
      case Nil => lp.reverse
      case h::tail => _pack(lrem.takeWhile(_ == h)::lp, lrem.dropWhile(_ == h))
    }
    _pack(Nil, l)
  }
  def encode[T](l: List[T]): List[(Int, T)] =
    pack(l).map(subL => (subL.length, subL.head))
  println("encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
