package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P10._

@RunWith(classOf[JUnitRunner])
class P10TestSuite extends FunSuite {
  test("encode an ordinary list: encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))") {
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  test("encode an ordinary list: encode(List(1, 1, 2, 1, 3, 5, 8)) = List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)") {
    assert(P10.encode(List(1, 1, 2, 1, 3, 5, 8)) === List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)))
  }
  test("encode an one-item list: encode(List(3)) = List((1, 3))") {
    assert(P10.encode(List(3)) === List((1, 3)))
  }
  test("encode an empty list: encode(List()) = List()") {
    assert(P10.encode(List()) === List())
  }
}
