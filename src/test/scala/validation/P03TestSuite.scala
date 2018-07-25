package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P03._

@RunWith(classOf[JUnitRunner])
class P03TestSuite extends FunSuite {
  test("Kth element of a normal Int list: nth(3, List(1, 2, 3, 4, 5)) = 4") {
    assert(P03.nth(3, List(1, 2, 3, 4, 5)) === 4)
  }
  test("Kth element of a normal String list: nth(0, List(\"hello\", \"world\")) = \"hello\"") {
    assert(P03.nth(0, List("hello", "world")) === "hello")
  }
  test("Kth element of a short list: nth(1, List(3)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P03.nth(1, List(3))
    }
  }
  test("Kth element of an empty list: nth(0, List()) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P03.nth(0, List())
    }
  }
}
