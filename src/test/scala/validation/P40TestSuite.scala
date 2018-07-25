package validation

import Arithmetic.P40.P40._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P40TestSuite extends FunSuite {
  test("8.goldbach should be (3, 5)") {
    8.goldbach === (3, 5)
  }

  test("goldbach should always return the smallest pair of prime number: 16.goldbach == (3, 13)") {
    16.goldbach === (3, 13) // not (5, 11)
  }

  test("goldbach should always return the smallest pair of prime number: 20.goldbach == (3, 17)") {
    20.goldbach === (3, 17) // not (7, 13)
  }

  test("goldbach on odd numbers should raise IllegalArgumentException") {
    intercept[IllegalArgumentException](
      9.goldbach
    )
  }

  test("goldbach on numbers less than or equal to 2 should raise IllegalArgumentException") {
    intercept[IllegalArgumentException](
      2.goldbach
    )
  }
}
