package Arithmetic.P38

import org.scalameter._

object P38 extends App {
  val standardConfig = config(
    Key.exec.minWarmupRuns -> 5,
    Key.exec.maxWarmupRuns -> 10,
    Key.exec.benchRuns -> 100,
  ) withWarmer(new Warmer.Default)

  import Arithmetic.P34.P34._
  val raw_time = standardConfig measure {
    10090.totient
  }

  import Arithmetic.P37.P37._
  val improved_time = standardConfig measure {
    10090.totient_improve
  }

  println(s"raw: ${raw_time}, improved: ${improved_time}")
  println(s"speedup: ${raw_time.value / improved_time.value}")
}
