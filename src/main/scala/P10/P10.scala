package P10

import P09._

object P10 {
  def encode[T](l: List[T]): List[(Int, T)] = P09.pack(l) map {
    ll => (ll.length, ll.head)
  }
}
