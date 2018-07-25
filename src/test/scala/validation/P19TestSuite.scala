package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P19._

@RunWith(classOf[JUnitRunner])
class P19TestSuite extends FunSuite {
  test("rotate an ordinary list: rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)") {
    assert(P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }
  test("rotate an ordinary list: rotate(2, List(1, 3, 2, 8)) = List(2, 8, 1, 3)") {
    assert(P19.rotate(2, List(1, 3, 2, 8)) === List(2, 8, 1, 3))
  }
  test("rotate an ordinary list by 0: rotate(0, List(1, 2, 3, 4)) = List(1, 2, 3, 4)") {
    assert(P19.rotate(0, List(1, 2, 3, 4)) === List(1, 2, 3, 4))
  }
  test("rotate an ordinary list by a negative number: rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)") {
    assert(P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }
  test("rotate an ordinary list by a large number: rotate(7, List(1, 2, 3, 4)) = List(4, 1, 2, 3)") {
    assert(P19.rotate(7, List(1, 2, 3, 4)) === List(4, 1, 2, 3))
  }
  test("rotate an ordinary list by a large number: rotate(-7, List(1, 2, 3, 4)) = List(2, 3, 4, 1)") {
    assert(P19.rotate(-7, List(1, 2, 3, 4)) === List(2, 3, 4, 1))
  }
  test("rotate an empty list: rotate(3, List()) = List()") {
    assert(P19.rotate(3, List()) === List())
  }
}
