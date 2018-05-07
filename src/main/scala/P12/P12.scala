package P12

object P12 {
  def decode[T](l: List[(Int, T)]): List[T] = l flatMap {
    case (l, e) => List.fill(l)(e)
  }

//  def decode[T](l: List[(Int, T)]): List[T] = l flatMap {
//    pair => List.fill(pair._1)(pair._2)
//  }
}
