package WorkingWithLists.P26

object P26 {
  def combinations[T](k: Int, l: List[T]): List[List[T]] = {
    if (k < 0 || k > l.length) throw new IllegalArgumentException
    else if (k == 0) List(List())
    else (
      for (i <- 0 to l.length - 1 if i + k <= l.length) yield
        combinations(k - 1, l.slice(i + 1, l.length)) map { l(i) :: _ }
      ).reduce((prev, curr) => prev ::: curr)
  }


  /*
   * A clean but expensive solution from official website (http://aperiodic.net/phil/scala/s-99/p26.scala)
   */
  def flatMapSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] =
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }

  def combinations_FP[A](n: Int, ls: List[A]): List[List[A]] =
    if (n == 0) List(Nil)
    else flatMapSublists(ls) { sl =>
      combinations_FP(n - 1, sl.tail) map {sl.head :: _}
    }
}
