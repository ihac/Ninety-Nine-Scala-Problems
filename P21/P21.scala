object P21 extends App {
  // def insertAt[T](e: T, i: Int, l: List[T]): List[T] = {
    // def _insertAt[T](prev: List[T], next: List[T], idx: Int): List[T] = (next, idx) match {
      // case (nextTmp, x) if (x == i) => (e::prev).reverse ::: nextTmp
      // case (h::tail, x) if (x < i) => _insertAt(h::prev, tail, x+1)
      // case (_, _) => throw new Exception
    // }
    // _insertAt(List[T](), l, 0)
  // }
  def insertAt[T](e: T, i: Int, l: List[T]): List[T] = l.splitAt(i) match {
    case (prev, next) => prev ::: (e :: next)
  }
  def insertAt2[T](e: T, i: Int, l: List[T]): List[T] = {
    if (i < 0 || i >= l.length) throw new Exception
    else l.take(i) ::: List(e) ::: l.drop(i)
  }
  println("insertAt('new, 1, List('a, 'b, 'c, 'd)) = " +
    insertAt('new, 1, List('a, 'b, 'c, 'd)))
}
