object P07 extends App {
  def flatten(l: List[Any]): List[Any] = l.foldLeft(List[Any]()){
    case (lr, el: List[Any]) => lr:::flatten(el)
    case (lr, e) => lr:::List(e)
  }
  def flatten2(l: List[Any]): List[Any] = l flatMap {
    case el: List[_] => flatten(el)
    case e => List(e)
  }

  println("flatten(List(List(1, 1), 2, List(3, List(5, 8)))) = "
    + flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  println("flatten(List(Nil, List(1, 2, 3), List(List(\"hello\", \"nothing\"), \"hac\"))) = "
    + flatten2(List(Nil, List(1, 2, 3), List(List("hello", "nothing"), "hac"))))
}
