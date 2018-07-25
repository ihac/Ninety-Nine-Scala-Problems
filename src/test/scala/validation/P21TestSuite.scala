package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P21._

@RunWith(classOf[JUnitRunner])
class P21TestSuite extends FunSuite {
  test("insertAt an ordinary list: insertAt('new, 1, List('a, 'b, 'c, 'd)) = List('a, 'new, 'b, 'c, 'd)") {
    assert(P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }
  test("insertAt an ordinary list: insertAt(5, 2, List(1, 3, 2, 8)) = List(1, 3, 5, 2, 8)") {
    assert(P21.insertAt(5, 2, List(1, 3, 2, 8)) === List(1, 3, 5, 2, 8))
  }
  test("insertAt an ordinary list by a negative index: insertAt(10, -2, List(1, 2, 3, 4)) = List(10, 1, 2, 3, 4)") {
    assert(P21.insertAt(10, -2, List(1, 2, 3, 4)) === List(10, 1, 2, 3, 4))
  }
  test("insertAt an ordinary list by a large index: insertAt(5, 8, List(1, 2, 3, 4)) = List(1, 2, 3, 4, 5)") {
    assert(P21.insertAt(5, 8, List(1, 2, 3, 4)) === List(1, 2, 3, 4, 5))
  }
  test("insertAt an empty list: insertAt(1, 0, List()) = List(1)") {
    assert(P21.insertAt(1, 0, List()) === List(1))
  }

  test("[Split] insertAt an ordinary list: insertAt_Split('new, 1, List('a, 'b, 'c, 'd)) = List('a, 'new, 'b, 'c, 'd)") {
    assert(P21.insertAt_Split('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }
  test("[Split] insertAt an ordinary list: insertAt_Split(5, 2, List(1, 3, 2, 8)) = List(1, 3, 5, 2, 8)") {
    assert(P21.insertAt_Split(5, 2, List(1, 3, 2, 8)) === List(1, 3, 5, 2, 8))
  }
  test("[Split] insertAt an ordinary list by a negative index: insertAt_Split(10, -2, List(1, 2, 3, 4)) = List(10, 1, 2, 3, 4)") {
    assert(P21.insertAt_Split(10, -2, List(1, 2, 3, 4)) === List(10, 1, 2, 3, 4))
  }
  test("[Split] insertAt an ordinary list by a large index: insertAt_Split(5, 8, List(1, 2, 3, 4)) = List(1, 2, 3, 4, 5)") {
    assert(P21.insertAt_Split(5, 8, List(1, 2, 3, 4)) === List(1, 2, 3, 4, 5))
  }
  test("[Split] insertAt an empty list: insertAt_Split(1, 0, List()) = List(1)") {
    assert(P21.insertAt_Split(1, 0, List()) === List(1))
  }
}

