package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P16._

@RunWith(classOf[JUnitRunner])
class P16TestSuite extends FunSuite {
  test("drop an ordinary list: drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)") {
    assert(P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
  test("drop an ordinary list: drop(2, List(1, 3, 2, 8)) = List(1, 2)") {
    assert(P16.drop(2, List(1, 3, 2, 8)) === List(1, 2))
  }
  test("drop an ordinary list by 1: drop(1, List(1, 2, 2, 1)) = List()") {
    assert(P16.drop(1, List(1, 3, 2, 8)) === List())
  }
  test("drop a one-item list by 2: drop(2, List(3)) = List(3)") {
    assert(P16.drop(2, List(3)) === List(3))
  }
  test("drop an empty list: drop(3, List()) = List()") {
    assert(P16.drop(3, List()) === List())
  }

  test("[FP] drop an ordinary list: drop_FP(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)") {
    assert(P16.drop_FP(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
  test("[FP] drop an ordinary list: drop_FP(2, List(1, 3, 2, 8)) = List(1, 2)") {
    assert(P16.drop_FP(2, List(1, 3, 2, 8)) === List(1, 2))
  }
  test("[FP] drop an ordinary list by 1: drop_FP(1, List(1, 2, 2, 1)) = List()") {
    assert(P16.drop_FP(1, List(1, 3, 2, 8)) === List())
  }
  test("[FP] drop a one-item list by 2: drop_FP(2, List(3)) = List(3)") {
    assert(P16.drop_FP(2, List(3)) === List(3))
  }
  test("[FP] drop an empty list: drop_FP(3, List()) = List()") {
    assert(P16.drop_FP(3, List()) === List())
  }
}
