package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P18._

@RunWith(classOf[JUnitRunner])
class P18TestSuite extends FunSuite {
  test("slice an ordinary list: slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('d, 'e, 'f, 'g)") {
    assert(P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g))
  }
  test("slice an ordinary list: slice(2, 5, List(1, 1, 2, 1, 3, 5, 8)) = List(2, 1, 3)") {
    assert(P18.slice(2, 5, List(1, 1, 2, 1, 3, 5, 8)) === List(2, 1, 3))
  }
  test("slice an ordinary list: slice(0, 8, List(1, 3)) = List(1, 3)") {
    assert(P18.slice(0, 8, List(1, 3)) === List(1, 3))
  }
  test("slice an ordinary list: slice(4, 8, List(1, 3)) = List()") {
    assert(P18.slice(4, 8, List(1, 3)) === List())
  }
  test("slice an ordinary list by negative indices: slice(-2, 2, List(1, 3, 8, 5)) = List(1, 3)") {
    assert(P18.slice(-2, 2, List(1, 3, 8, 5)) === List(1, 3))
  }
  test("slice an empty list: slice(0, 2, List()) = List()") {
    assert(P18.slice(0, 2, List()) === List())
  }
  test("[Tail Recursion] slice an ordinary list: slice_TailRecursion(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = List('d, 'e, 'f, 'g)") {
    assert(P18.slice_TailRecursion(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g))
  }
  test("[Tail Recursion] slice an ordinary list: slice_TailRecursion(2, 5, List(1, 1, 2, 1, 3, 5, 8)) = List(2, 1, 3)") {
    assert(P18.slice_TailRecursion(2, 5, List(1, 1, 2, 1, 3, 5, 8)) === List(2, 1, 3))
  }
  test("[Tail Recursion] slice an ordinary list: slice_TailRecursion(0, 8, List(1, 3)) = List(1, 3)") {
    assert(P18.slice_TailRecursion(0, 8, List(1, 3)) === List(1, 3))
  }
  test("[Tail Recursion] slice an ordinary list: slice_TailRecursion(4, 8, List(1, 3)) = List()") {
    assert(P18.slice_TailRecursion(4, 8, List(1, 3)) === List())
  }
  test("[Tail Recursion] slice an ordinary list by negative indices: slice_TailRecursion(-2, 2, List(1, 3, 8, 5)) = List(1, 3)") {
    assert(P18.slice_TailRecursion(-2, 2, List(1, 3, 8, 5)) === List(1, 3))
  }
  test("[Tail Recursion] slice an empty list: slice_TailRecursion(0, 2, List()) = List()") {
    assert(P18.slice_TailRecursion(0, 2, List()) === List())
  }
}
