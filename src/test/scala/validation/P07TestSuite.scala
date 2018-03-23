package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P07._

@RunWith(classOf[JUnitRunner])
class P07TestSuite extends FunSuite {
  test("flatten an ordinary list: flatten(List(List(1, 1), 2, List(3, List(5, 8)))) = List(1, 1, 2, 3, 5, 8)") {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }
  test("flatten an ordinary type-mixed list: flatten(List(2, List(List(1, 2)), List(\"hello\", \"world\"))) = List(2, 1, 2, \"hello\", \"world\")") {
    assert(P07.flatten(List(2, List(List(1, 2)), List("hello", "world"))) === List(2, 1, 2, "hello", "world"))
  }
  test("flatten an one-item list: flatten(List(List(3))) = List(3)") {
    assert(P07.flatten(List(List(3))) === List(3))
  }
  test("flatten an empty list: flatten(List()) = List()") {
    assert(P07.flatten(List()) === List())
  }

  test("[FlatMap] flatten an ordinary list: flatten(List(List(1, 1), 2, List(3, List(5, 8)))) = List(1, 1, 2, 3, 5, 8)") {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }
  test("[FlatMap] flatten an ordinary type-mixed list: flatten(List(2, List(List(1, 2)), List(\"hello\", \"world\"))) = List(2, 1, 2, \"hello\", \"world\")") {
    assert(P07.flatten(List(2, List(List(1, 2)), List("hello", "world"))) === List(2, 1, 2, "hello", "world"))
  }
  test("[FlatMap] flatten an one-item list: flatten(List(List(3))) = List(3)") {
    assert(P07.flatten(List(List(3))) === List(3))
  }
  test("[FlatMap] flatten an empty list: flatten(List()) = List()") {
    assert(P07.flatten(List()) === List())
  }
}

