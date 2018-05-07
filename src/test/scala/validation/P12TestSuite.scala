package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P12._

@RunWith(classOf[JUnitRunner])
class P12TestSuite extends FunSuite {
  test("decode an ordinary list: decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)") {
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
  test("decode an ordinary list: decode(List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)) = List(1, 1, 2, 1, 3, 5, 8))") {
    assert(P12.decode(List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8))) === List(1, 1, 2, 1, 3, 5, 8))
  }
  test("decode an one-item list: decode(List((1, 3))) = List(3)") {
    assert(P12.decode(List((1, 3))) === List(3))
  }
  test("decode an empty list: decode(List()) = List()") {
    assert(P12.decode(List()) === List())
  }
}
