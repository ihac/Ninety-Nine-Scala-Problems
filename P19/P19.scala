object P19 extends App {
  def rotate[T](n: Int, l: List[T]): List[T] = {
    val nn = if (l.isEmpty) 0 else n % l.length
    if (nn >= 0) l.drop(nn) ::: l.take(nn)
    else rotate(nn + l.length, l)
  }
  println("rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = " +
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println("rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = " +
    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
