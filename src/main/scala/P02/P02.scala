package P02

import java.util.NoSuchElementException

object P02 {
  def penultimate[T](l: List[T]): T = l match {
    case e::_::Nil => e
    case _::ls => penultimate(ls)
    case _ => throw new NoSuchElementException
  }
}
