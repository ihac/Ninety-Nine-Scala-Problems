package P24

import P23._

object P24 {
  def lotto(k: Int, M: Int): List[Int] =
    P23.randomSelect(k, List.range(1, M+1))
}
