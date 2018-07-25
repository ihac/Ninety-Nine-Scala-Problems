package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P02._

@RunWith(classOf[JUnitRunner])
class P02TestSuite extends FunSuite {
  test("penultimate element of Int list: List(1, 2, 3, 4, 5) = 4") {
    assert(P02.penultimate(List(1, 2, 3, 4, 5)) === 4)
  }
  test("penultimate element of String list: List(\"hello\", \"world\") = \"hello\"") {
    assert(P02.penultimate(List("hello", "world")) === "hello")
  }
  test("penultimate element of one-item list: List(3) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P02.penultimate(List(3))
    }
  }
  test("penultimate element of empty list: List() = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P02.penultimate(List())
    }
  }
}
