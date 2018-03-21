package P04

object P04 {
  def length[T](l: List[T]): Int = {
    def _length[T](prevLen: Int, remList: List[T]): Int = remList match {
      case _::ls => _length(prevLen+1, ls)
      case Nil => prevLen
    }
    _length(0, l)
  }

  def length_NoTailRecursion[T](l: List[T]):Int = l match {
    case Nil => 0
    case _::ls => 1 + length_NoTailRecursion(ls)
  }
}
