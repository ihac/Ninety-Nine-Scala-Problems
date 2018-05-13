package P26

import P20._

object P26 {
  def combinations[T](k: Int, l: List[T]): List[List[T]] =
    if (k < 0 || k > l.length) throw new IllegalArgumentException
    else if (k == 1) l.map(List(_))
    else (for (i <- 0 to l.length-1) yield {
      if (i + k > l.length || k == 0) List()
      else combinations(k-1, l.slice(i+1, l.length)).map(l(i)::_)
    }).reduce((prev, curr) => prev:::curr)
}
