package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Arithmetic.P32._

@RunWith(classOf[JUnitRunner])
class P32TestSuite extends FunSuite {
  test("gcd of two relatively prime numbers: gcd(15, 22) == 1") {
    assert(P32.gcd(15, 22) === 1)
  }

  test("gcd of two relatively prime numbers: gcd(35, 64) == 1") {
    assert(P32.gcd(35, 64) === 1)
  }

  test("gcd of two numbers which are not relatively prime: gcd(8, 12) == 4") {
    assert(P32.gcd(8, 12) === 4)
  }

  test("gcd of two numbers where a is multiple of b: gcd(15, 5) == 5") {
    assert(P32.gcd(15, 5) === 5)
  }

  test("gcd of two numbers where b is multiple of a: gcd(4, 8) == 4") {
    assert(P32.gcd(4, 8) === 4)
  }
}
