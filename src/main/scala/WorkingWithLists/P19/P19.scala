package WorkingWithLists.P19

object P19 {
  def rotate[T](n: Int, l: List[T]): List[T] = {
    val nn = if (l.isEmpty) 0 else n % l.length
    if (nn >= 0) l.drop(nn):::l.take(nn)
    else rotate(nn + l.length, l)
  }
}
