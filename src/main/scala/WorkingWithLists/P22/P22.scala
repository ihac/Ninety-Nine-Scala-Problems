package WorkingWithLists.P22

object P22 {
  def range(i: Int, j: Int): List[Int] = (i to j).toList

  def range_TailRecursion(i: Int, j: Int): List[Int] = {
    def _range(k: Int, prev: List[Int]): List[Int] =
      if (k > j) prev.reverse
      else _range(k+1, k::prev)
    _range(i, Nil)
  }
}
