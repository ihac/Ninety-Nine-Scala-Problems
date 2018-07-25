package WorkingWithLists.P15

object P15 {
 def duplicateN_FlatMap[T](n: Int, l: List[T]): List[T] = l flatMap { List.fill(n)(_) }

 def duplicateN_FoldRight[T](n: Int, l: List[T]): List[T] = l.foldRight(List[T]()) {
  (e, ll) => List.fill(n)(e):::ll
 }
}
