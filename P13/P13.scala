object P13 extends App {
  def encodeDirect[T](l: List[T]): List[(Int, T)] = {
    def _aux[T](prev: List[(Int, T)], next: List[T]): List[(Int, T)] = next match {
      case Nil => prev.reverse
      case h::tail => {
        val len = tail.prefixLength(_ == h)
        _aux((len+1, h)::prev, tail.drop(len))
      }
    }
    _aux(Nil, l)
  }
  println("encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = " +
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
