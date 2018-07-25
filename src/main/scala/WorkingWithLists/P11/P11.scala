package WorkingWithLists.P11

import WorkingWithLists.P09._

object P11 {
  def encodeModified[T](l: List[T]): List[Any] = P09.pack(l) map {
    case h::Nil => h
    case ll => (ll.length, ll.head)
  }
}
