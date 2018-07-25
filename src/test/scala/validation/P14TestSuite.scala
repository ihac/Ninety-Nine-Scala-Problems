package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P14._

@RunWith(classOf[JUnitRunner])
class P14TestSuite extends FunSuite {
  test("duplicate an ordinary list: duplicate(List('a, 'b, 'c, 'c, 'd)) = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)") {
    assert(P14.duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
  test("duplicate an ordinary list: duplicate(List(1, 3, 2, 8)) = List(1, 3, 2, 8)") {
    assert(P14.duplicate(List(1, 3, 2, 8)) === List(1, 1, 3, 3, 2, 2, 8, 8))
  }
  test("duplicate a one-item list: duplicate(List(3)) = List(3, 3)") {
    assert(P14.duplicate(List(3)) === List(3, 3))
  }
  test("duplicate an empty list: duplicate(List()) = List()") {
    assert(P14.duplicate(List()) === List())
  }
}
