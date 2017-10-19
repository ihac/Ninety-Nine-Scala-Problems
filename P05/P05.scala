object P05 extends App {
  def reverse[T](l: List[T]): List[T] = {
    def _reverse[T](lr: List[T], ln: List[T]): List[T] = ln match {
      case Nil => lr
      case x::tail => _reverse(x::lr, tail)
    }
    _reverse(Nil, l)
  }
  println("reverse(List(1, 1, 2, 3, 5, 8)) = " + reverse(List(1, 1, 2, 3, 5, 8)))
}
