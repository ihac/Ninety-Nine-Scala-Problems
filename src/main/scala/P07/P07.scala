package P07

object P07 {
  def flatten(l: List[Any]): List[Any] = l.foldRight(List[Any]()) {
    case (el: List[Any], lr) => flatten(el):::lr
    case (e, lr) => e::lr
  }

  def flatten_FlatMap(l: List[Any]): List[Any] = l.flatMap {
    case el: List[Any] => flatten_FlatMap(el)
    case e => List(e)
  }
}
