object P17 extends App {
  def split[T](n: Int, l: List[T]): (List[T], List[T]) = {
    def _split[T](res: List[T], next: List[T], cnt: Int): (List[T], List[T]) = (next, cnt) match {
      case (Nil, _) => (res.reverse, List[T]())
      case (list, x) if x == n => (res.reverse, list)
      case (h::tail, x) => _split(h::res, tail, x+1)
    }
    _split(Nil, l, 0)
  }


  println("split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = " +
    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println("split(3, List('a, 'b, 'c)) = " +
    split(3, List('a, 'b, 'c)))
  println("split(1, List('a, 'b, 'c)) = " +
    split(1, List('a, 'b, 'c)))
  println("split(0, List('a, 'b, 'c)) = " +
    split(0, List('a, 'b, 'c)))
  println("split(3, List('a, 'b)) = " +
    split(3, List('a, 'b)))
}
