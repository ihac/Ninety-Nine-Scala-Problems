package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P04._

@RunWith(classOf[JUnitRunner])
class P04TestSuite extends FunSuite {
  test("length of Int list: length(List(1, 2, 3, 4, 5)) = 5") {
    assert(P04.length(List(1, 2, 3, 4, 5)) === 5)
  }
  test("length of String list: length(List(\"hello\", \"world\")) = 2") {
    assert(P04.length(List("hello", "world")) === 2)
  }
  test("length of empty list: length(List()) = 0") {
    assert(P04.length(List()) === 0)
  }

  test("[NoTailRecursion] length of Int list: length(List(1, 2, 3, 4, 5)) = 5") {
    assert(P04.length(List(1, 2, 3, 4, 5)) === 5)
  }
  test("[NoTailRecursion] length of String list: length(List(\"hello\", \"world\")) = 2") {
    assert(P04.length(List("hello", "world")) === 2)
  }
  test("[NoTailRecursion] length of empty list: length(List()) = 0") {
    assert(P04.length(List()) === 0)
  }
}
