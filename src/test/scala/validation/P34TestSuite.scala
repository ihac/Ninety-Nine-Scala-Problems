package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Arithmetic.P34.P34._

@RunWith(classOf[JUnitRunner])
class P34TestSuite extends FunSuite {
  test("totient of 10 should be 4: 10.totient == 4") {
    assert(10.totient === 4)
  }

  test("totient of 2 should be 1: 2.totient == 1") {
    assert(2.totient === 1)
  }

  test("totient of an arbitrary prime number NUM should be NUM - 1 : 17.totient == 16") {
    assert(17.totient === 16)
  }

  test("totient of an arbitrary prime number NUM should be NUM - 1 : 97.totient == 96") {
    assert(97.totient === 96)
  }
}
