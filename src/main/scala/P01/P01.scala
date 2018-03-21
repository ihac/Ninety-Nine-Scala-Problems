package P01

object P01 {
  def last[T](l: List[T]): T = l match {
    case x::Nil => x
    case _::ls => last(ls)
    case _ => throw new NoSuchElementException
  }
}
