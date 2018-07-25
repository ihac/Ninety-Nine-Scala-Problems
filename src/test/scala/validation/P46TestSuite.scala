package validation

import LogicAndCodes.P46._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P46TestSuite extends FunSuite {
  test("[and] and(true, true) should return true") {
    assert(P46.and(true, true) === true)
  }
  test("[and] and(true, false) should return false") {
    assert(P46.and(true, false) === false)
  }
  test("[and] and(false, true) should return false") {
    assert(P46.and(false, true) === false)
  }
  test("[and] and(false, false) should return false") {
    assert(P46.and(false, false) === false)
  }

  test("[or] or(true, true) should return true") {
    assert(P46.or(true, true) === true)
  }
  test("[or] or(true, false) should return false") {
    assert(P46.or(true, false) === true)
  }
  test("[or] or(false, true) should return false") {
    assert(P46.or(false, true) === true)
  }
  test("[or] or(false, false) should return false") {
    assert(P46.or(false, false) === false)
  }

  test("[not] not(true) should return false") {
    assert(P46.not(true) === false)
  }
  test("[not] not(false) should return true") {
    assert(P46.not(false) === true)
  }

  test("[xor] xor(true, true) should return false") {
    assert(P46.xor(true, true) === false)
  }
  test("[xor] xor(true, false) should return true") {
    assert(P46.xor(true, false) === true)
  }
  test("[xor] xor(false, true) should return true") {
    assert(P46.xor(false, true) === true)
  }
  test("[xor] xor(false, false) should return false") {
    assert(P46.xor(false, false) === false)
  }
}
