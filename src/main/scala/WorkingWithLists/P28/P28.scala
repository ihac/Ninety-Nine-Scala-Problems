package WorkingWithLists.P28

object P28 {
  def lsort[T](l: List[List[T]]): List[List[T]] =
    l sortBy (_.length)

  def lsortFreq[T](l: List[List[T]]): List[List[T]] =
    l.groupBy(_.length).toList.sortBy(_._2.length).map(_._2).flatten

  def lsortFreq_TempVar[T](l: List[List[T]]): List[List[T]] = {
    val lengthFreq = l map (_.length) groupBy (n => n) map (p => (p._1, p._2.length))
    l sortBy (e => lengthFreq(e.length))
  }
}
