package validation

import Arithmetic.P39._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P39TestSuite extends FunSuite {
  test("listPrimes should work for ranges of any size: Range 2 to 20") {
    assert(P39.listPrimesinRange(2 to 20) === List(2, 3, 5, 7, 11, 13, 17, 19))
  }

  test("listPrimes should work for ranges of any size: Range 10 to 100") {
    assert(P39.listPrimesinRange(10 to 100) ===
        List(11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
  }

  test("listPrimes should return Nil when no prime is found in the range") {
    assert(P39.listPrimesinRange(24 to 28) === Nil)
  }

  test("listPrimes should work when the range has only one number: 7") {
    assert(P39.listPrimesinRange(7 to 7) === List(7))
  }

  test("listPrimes should work when the range has only one number: 8") {
    assert(P39.listPrimesinRange(8 to 8) === Nil)
  }
}
