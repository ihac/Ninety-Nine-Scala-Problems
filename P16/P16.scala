object P16 extends App {
  def drop[T](n: Int, l: List[T]): List[T] = {
    def _drop[T](prev: List[T], next: List[T], cnt: Int): List[T] = (next, cnt) match {
      case (Nil, _) => prev.reverse
      case (_, x) if x == n => _drop(prev, next.tail, 1)
      case (_, _) => _drop(next.head::prev, next.tail, cnt+1)
    }
    _drop(Nil, l, 1)
  }

  def dropFP[T](n: Int, l: List[T]): List[T] =
    l.zipWithIndex filter { p => (p._2 + 1) % n != 0 } map { _._1 }

  println("drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k) = " +
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println("drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k) = " +
    dropFP(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
