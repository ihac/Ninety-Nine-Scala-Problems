package WorkingWithLists.P05

object P05 {
  def reverse[T](l: List[T]): List[T] = {
    def _reverse[T](prevList: List[T], remList: List[T]): List[T] = remList match {
      case e::ls => _reverse(e::prevList, ls)
      case Nil => prevList
    }
    _reverse(Nil, l)
  }

  def reverse_ListAppend[T](l: List[T]): List[T] = l match {
    case e::ls => reverse_ListAppend(ls):::List(e)
    case Nil => Nil
  }

  def reverse_FoldLeft[T](l: List[T]): List[T] =
    l.foldLeft(List[T]()) { (lr, e) => e::lr }
}
