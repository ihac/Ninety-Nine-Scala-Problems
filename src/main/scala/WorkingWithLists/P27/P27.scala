package WorkingWithLists.P27

object P27 {
  import WorkingWithLists.P26.P26
  /*
   * group 9 people into 3 disjoint subgroups (size: 2, 3, 4)
   */
  def group3[T](l: List[T]): List[List[List[T]]] = {
    require(l.length == 9)
    for {
      a <- P26.combinations(2, l)
      ll = l diff a
      b <- P26.combinations(3, ll)
    } yield List(a, b, ll diff b)
  }

  def group[T](n: List[Int], l: List[T]): List[List[List[T]]] = {
    require(n.sum == l.length)
    n match {
      case Nil => List(Nil)
      case h :: tail =>
        P26.combinations(h, l) flatMap { a =>
          group(tail, l diff a) map (a :: _)
        }
    }
  }
}
