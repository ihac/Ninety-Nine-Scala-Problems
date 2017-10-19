object P03 extends App {
  def nth[T](n: Int, l: List[T]): T = l match {
    case x::_ if n == 0 => x
    case _::ls => nth(n-1, ls)
    case Nil => throw new NoSuchElementException
  }
  println("nth(2, List(1, 1, 2, 3, 5, 8)) = " + nth(2, List(1, 1, 2, 3, 5, 8)))
  println("nth(2, List(1, 2, 1)) = " + nth(2, List(1, 2, 1)))
  println("nth(2, List(1, 2)) = " + nth(2, List(1, 2)))
}
