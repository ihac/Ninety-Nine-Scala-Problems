package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P33.P33._

@RunWith(classOf[JUnitRunner])
class P33TestSuite extends FunSuite {
  test("9 and 12 is not coprime: 9.isCoprimeTo(12) == false") {
    assert(9.isCoprimeTo(12) === false)
  }

  test("9 and 22 is coprime: 9.isCoprimeTo(22) == true") {
    assert(9.isCoprimeTo(22) === true)
  }

  test("8 and 8 is not coprime: 8.isCoprimeTo(8) == false") {
    assert(8.isCoprimeTo(8) === false)
  }

  test("35 and 64 is coprime: 35.isCoprimeTo(64) == true") {
    assert(35.isCoprimeTo(64) === true)
  }
}
