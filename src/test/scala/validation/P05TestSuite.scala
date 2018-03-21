package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P05._

@RunWith(classOf[JUnitRunner])
class P05TestSuite extends FunSuite {
  test("reverse an ordinary Int list: reverse(List(1, 2, 3, 4)) = List(4, 3, 2, 1)") {
    assert(P05.reverse(List(1, 2, 3, 4)) === List(4, 3, 2, 1))
  }
  test("reverse an ordinary String list: reverse(List(\"hello\", \"world\")) = List(\"world\", \"hello\")") {
    assert(P05.reverse(List("hello", "world")) === List("world", "hello"))
  }
  test("reverse a one-item list: reverse(List(3)) = List(3)") {
    assert(P05.reverse(List(3)) === List(3))
  }
  test("reverse an empty list: reverse(List()) = List()") {
    assert(P05.reverse(List()) === List())
  }

  test("[ListAppend] reverse an ordinary Int list: reverse(List(1, 2, 3, 4)) = List(4, 3, 2, 1)") {
    assert(P05.reverse_ListAppend(List(1, 2, 3, 4)) === List(4, 3, 2, 1))
  }
  test("[ListAppend] reverse an ordinary String list: reverse(List(\"hello\", \"world\")) = List(\"world\", \"hello\")") {
    assert(P05.reverse_ListAppend(List("hello", "world")) === List("world", "hello"))
  }
  test("[ListAppend] reverse a one-item list: reverse(List(3)) = List(3)") {
    assert(P05.reverse_ListAppend(List(3)) === List(3))
  }
  test("[ListAppend] reverse an empty list: reverse(List()) = List()") {
    assert(P05.reverse_ListAppend(List()) === List())
  }
}

