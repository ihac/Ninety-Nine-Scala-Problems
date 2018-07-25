package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P13._

@RunWith(classOf[JUnitRunner])
class P13TestSuite extends FunSuite {
  test("encodeDirect an ordinary list: encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))") {
    assert(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  test("encodeDirect an ordinary list: encodeDirect(List(1, 1, 2, 1, 3, 5, 8)) = List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)") {
    assert(P13.encodeDirect(List(1, 1, 2, 1, 3, 5, 8)) === List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)))
  }
  test("encodeDirect an one-item list: encodeDirect(List(3)) = List((1, 3))") {
    assert(P13.encodeDirect(List(3)) === List((1, 3)))
  }
  test("encodeDirect an empty list: encodeDirect(List()) = List()") {
    assert(P13.encodeDirect(List()) === List())
  }
  test("[Fold Right] encodeDirect an ordinary list: encodeDirect_FoldRight(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))") {
    assert(P13.encodeDirect_FoldRight(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  test("[Fold Right] encodeDirect an ordinary list: encodeDirect_FoldRight(List(1, 1, 2, 1, 3, 5, 8)) = List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)") {
    assert(P13.encodeDirect_FoldRight(List(1, 1, 2, 1, 3, 5, 8)) === List((2, 1), (1, 2), (1, 1), (1, 3), (1, 5), (1, 8)))
  }
  test("[Fold Right] encodeDirect an one-item list: encodeDirect_FoldRight(List(3)) = List((1, 3))") {
    assert(P13.encodeDirect_FoldRight(List(3)) === List((1, 3)))
  }
  test("[Fold Right] encodeDirect an empty list: encodeDirect_FoldRight(List()) = List()") {
    assert(P13.encodeDirect_FoldRight(List()) === List())
  }
}
