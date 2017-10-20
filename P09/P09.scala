object P09 extends App {
  def pack[T](l: List[T]): List[List[T]] = {
    def _pack(lp: List[List[T]], lrem: List[T]): List[List[T]] = lrem match {
      case Nil => lp.reverse
      case h::tail => _pack(lrem.takeWhile(_ == h)::lp, lrem.dropWhile(_ == h))
    }
    _pack(Nil, l)
  }

  def packFP[T](l: List[T]): List[List[T]] = l.foldLeft(List[List[T]]()){
    (lp, e) => if (lp.isEmpty || e != lp.head.head) List(e)::lp
               else (e::lp.head)::(lp.tail)
  }.reverse
  println("pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println("pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    packFP(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
