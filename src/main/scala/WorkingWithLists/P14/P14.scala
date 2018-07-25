package WorkingWithLists.P14

object P14 {
  def duplicate[T](l: List[T]): List[T] = l.foldRight(List[T]()) {
    (e, ll) => e::e::ll
  }
}
