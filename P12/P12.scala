object P12 extends App {
  def decode[T](l: List[(Int, T)]): List[T] = l flatMap { pair =>
    List.fill(pair._1)(pair._2)
  }
  println("decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) = " +
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}
