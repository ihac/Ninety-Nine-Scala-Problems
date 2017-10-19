object P04 extends App {
  def length[T](l: List[T]): Int = l match {
    case Nil => 0
    case _::ls => 1 + length(ls)
  }
  def lengthWithTailRecursion[T](l: List[T]): Int = {
    def _length[T](prevLen: Int, ll: List[T]): Int = ll match {
      case Nil => prevLen
      case _::lls => _length(prevLen+1, lls)
    }
    _length(0, l)
  }
  println("length(List(1, 1, 2, 3, 5, 8)) = " + length(List(1, 1, 2, 3, 5, 8)))
  println("lengthWithTailRecursion(List(1, 1, 2, 3, 5, 8)) = " + lengthWithTailRecursion(List(1, 1, 2, 3, 5, 8)))
}
