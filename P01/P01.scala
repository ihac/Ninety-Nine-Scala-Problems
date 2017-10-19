object P01 extends App {
  def last[T](l: List[T]): T = l match {
    case x::Nil => x
    case _::ls => last(ls)
    case _ => throw new NoSuchElementException
  }
  println(last(List(1, 3, 5, 4)))
  println(last(List("hello", "nothing", "catch")))
  println(last(List(2)))
  println(last(List()))
}
