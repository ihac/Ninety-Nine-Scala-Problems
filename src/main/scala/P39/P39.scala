package P39

object P39 {
  import P31.P31.primeStream
  def listPrimesinRange(r: Range): List[Int] =
    (primeStream dropWhile { _ < r.min } takeWhile { _ <= r.max }).toList
}
