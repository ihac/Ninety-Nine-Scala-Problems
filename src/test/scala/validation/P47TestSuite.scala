package validation

import LogicAndCodes.P47.P47._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P47TestSuite extends FunSuite {
  test("[and] (true and true) should return true") {
    assert((true and true) === true)
  }
  test("[and] (true and false) should return false") {
    assert((true and false) === false)
  }
  test("[and] (false and true) should return false") {
    assert((false and true) === false)
  }
  test("[and] (false and false) should return false") {
    assert((false and false) === false)
  }

  test("[or] (true or true) should return true") {
    assert((true or true) === true)
  }
  test("[or] (true or false) should return false") {
    assert((true or false) === true)
  }
  test("[or] (false or true) should return false") {
    assert((false or true) === true)
  }
  test("[or] (false or false) should return false") {
    assert((false or false) === false)
  }

  test("[xor] (true xor true) should return false") {
    assert((true xor true) === false)
  }
  test("[xor] (true xor false) should return true") {
    assert((true xor false) === true)
  }
  test("[xor] (false xor true) should return true") {
    assert((false xor true) === true)
  }
  test("[xor] (false xor false) should return false") {
    assert((false xor false) === false)
  }
}
