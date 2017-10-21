object P14 extends App {
  // foldLeft here is much better than flatMap
  def duplicate[T](l: List[T]): List[T] = l.foldLeft(List[T]()) {
    (ld, e) => e::e::ld
  }.reverse
  println("duplicate(List('a, 'b, 'c, 'c, 'd)) = " + duplicate(List('a, 'b, 'c, 'c, 'd)))
}
