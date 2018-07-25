package WorkingWithLists.P03

import java.util.NoSuchElementException

object P03 {
  def nth[T](n: Int, l: List[T]): T = l match {
    case e::_ if n == 0 => e
    case _::ls => nth(n-1, ls)
    case _ => throw new NoSuchElementException
  }
}
