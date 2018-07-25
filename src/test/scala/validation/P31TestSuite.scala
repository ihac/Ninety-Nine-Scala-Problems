package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Arithmetic.P31.P31._

@RunWith(classOf[JUnitRunner])
class P31TestSuite extends FunSuite {
  test("7.isPrime should return true") {
    assert(7.isPrime === true)
  }

  test("2.isPrime should return true") {
    assert(2.isPrime === true)
  }

  test("97.isPrime should return true") {
    assert(97.isPrime === true)
  }

  test("-3.isPrime should return false") {
    assert(-3.isPrime === false)
  }
}
