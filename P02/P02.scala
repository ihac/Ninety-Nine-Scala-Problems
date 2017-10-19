object P02 extends App {
  def penultimate[T](l: List[T]): T = l match {
    case x::_::Nil => x
    case _::ls => penultimate(ls)
    case _ => throw new NoSuchElementException
  }
  println(penultimate(List(1, 1, 2, 3, 5, 8)))
}
