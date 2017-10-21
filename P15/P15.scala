object P15 extends App {
  def duplicateN[T](n: Int, l: List[T]): List[T] = l.foldLeft(List[T]()) {
    // The reason not use `ld:::List.fill(n)(e)` is that
    // small_list:::large_list is much faster than large_list:::small_list
    (ld, e) => List.fill(n)(e):::ld
  }.reverse
  println("duplicateN(3, List('a, 'b, 'c, 'c, 'd)) = " +
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
}
