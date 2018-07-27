package LogicAndCodes.P49

import org.scalameter.{Key, Warmer, config}

object P49 {
  import scala.collection.mutable
  private val cache: mutable.Map[Int, List[String]] = mutable.Map(0 -> List(""))

  def gray(n: Int): List[String] = {
    require(n >= 0)
    if (cache isDefinedAt n) cache(n)
    else {
      val intm = gray(n - 1)
      cache(n) = (intm map { "0" + _ }) ::: (intm.reverse map { "1" + _ })
      cache(n)
    }
  }
}

object MainRun extends App {
  import P49._

  val standardConfig = config(
    Key.exec.minWarmupRuns -> 5,
    Key.exec.maxWarmupRuns -> 10,
    Key.exec.benchRuns -> 1,
  ) withWarmer(new Warmer.Default)

  val first_20_time = standardConfig measure {
    gray(5)
    gray(10)
    gray(15)
    gray(20)
  }
  val second_20_time = standardConfig measure {
    gray(5)
    gray(10)
    gray(15)
    gray(20)
  }
  println(s"${first_20_time} - ${second_20_time}")
  println(s"speedup: ${first_20_time.value / second_20_time.value}")
}
