package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P01._

@RunWith(classOf[JUnitRunner])
class P01TestSuite extends FunSuite {
  test("last element of Int list: List(1, 2, 3, 4, 5) = 5") {
    assert(P01.last(List(1, 2, 3, 4, 5)) === 5)
  }
  test("last element of String list: List(\"hello\", \"world\") = \"world\"") {
    assert(P01.last(List("hello", "world")) === "world")
  }
  test("last element of one-item list: List(3) = 3") {
    assert(P01.last(List(3)) === 3)
  }
  test("last element of empty list: List() = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P01.last(List())
    }
  }
}
