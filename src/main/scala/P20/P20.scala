package P20

object P20 {
  def removeAt[T](k: Int, l: List[T]): (List[T], T) =
    if (l.length <= k || k < 0) throw new java.util.NoSuchElementException
    else (l.zipWithIndex.filter(_._2 != k).map(_._1), l(k))

  def removeAt_FP[T](k: Int, l: List[T]): (List[T], T) =
    if (k < 0 || k >= l.length) throw new NoSuchElementException
    else (l.take(k) ::: l.drop(k + 1), l(k))

  def removeAt_Split[T](k: Int, l: List[T]): (List[T], T) = l.splitAt(k) match {
    case (Nil, h::tail) if k == 0 => (tail, h)
    case (h1::tail1, h2::tail2) => (h1::tail1:::tail2, h2)
    case _ => throw new java.util.NoSuchElementException
  }
  def removeAt_TailRecursion[T](k: Int, l: List[T]): (List[T], T) = {
    def _removeAt[T](i: Int, prev: List[T], next: List[T]): (List[T], T) = next match {
      case h::tail if i == k => (prev.reverse:::tail, h)
      case h::tail if i >= 0 && i < k => _removeAt(i+1, h::prev, tail)
      case _ => throw new java.util.NoSuchElementException
    }
    _removeAt(0, Nil, l)
  }
}
