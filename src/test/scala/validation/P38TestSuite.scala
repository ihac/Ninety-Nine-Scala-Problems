package validation

import org.scalameter._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P38TestSuite extends FunSuite {
  import Arithmetic.P34.P34._
  import Arithmetic.P37.P37._
  val standardConfig = config(
    Key.exec.minWarmupRuns -> 5,
    Key.exec.maxWarmupRuns -> 10,
    Key.exec.benchRuns -> 10
  ).withWarmer(new Warmer.Default)
    .withMeasurer {
      new Measurer.IgnoringGC
    }

  test(
    "compare performance of two different totient implementation: 10090.totient") {
    val raw_time = standardConfig measure {
      10090.totient
    }
    val improved_time = standardConfig measure {
      10090.totient_improve
    }

    println(s"totient: ${raw_time}, totient_improved: ${improved_time}")
    println(s"speedup: ${raw_time.value / improved_time.value}")
  }

  test("compare performance by large test set") {
    val inputs = 10 to 100000 by 1000
    val raw_time = standardConfig measure {
      inputs.foreach(_.totient)
    }
    val improved_time = standardConfig measure {
      inputs.foreach(_.totient_improve)
    }

    println(s"totient: ${raw_time}, totient_improved: ${improved_time}")
    println(s"speedup: ${raw_time.value / improved_time.value}")
  }
}
