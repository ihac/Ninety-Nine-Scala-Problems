package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P17._

@RunWith(classOf[JUnitRunner])
class P17TestSuite extends FunSuite {
  test("split an ordinary list: split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))") {
    assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
  test("split an ordinary list: split(5, List(1, 1, 2, 1, 3, 5, 8)) = (List(1, 1, 2, 1, 3), List(5, 8))") {
    assert(P17.split(5, List(1, 1, 2, 1, 3, 5, 8)) === (List(1, 1, 2, 1, 3), List(5, 8)))
  }
  test("split an ordinary list by 0: split(0, List(1, 3)) = (List(), List(1, 3))") {
    assert(P17.split(0, List(1, 3)) === (List(), List(1, 3)))
  }
  test("split an ordinary list by a large number: split(4, List(1, 3)) = (List(1, 3), List())") {
    assert(P17.split(4, List(1, 3)) === (List(1, 3), List()))
  }
  test("split an empty list: split(2, List()) = (List(), List())") {
    assert(P17.split(2, List()) === (List(), List()))
  }
  test("[Tail Recursion] split an ordinary list: split_TailRecursion(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))") {
    assert(P17.split_TailRecursion(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
  test("[Tail Recursion] split an ordinary list: split_TailRecursion(5, List(1, 1, 2, 1, 3, 5, 8)) = (List(1, 1, 2, 1, 3), List(5, 8))") {
    assert(P17.split_TailRecursion(5, List(1, 1, 2, 1, 3, 5, 8)) === (List(1, 1, 2, 1, 3), List(5, 8)))
  }
  test("[Tail Recursion] split an ordinary list by 0: split_TailRecursion(0, List(1, 3)) = (List(), List(1, 3))") {
    assert(P17.split_TailRecursion(0, List(1, 3)) === (List(), List(1, 3)))
  }
  test("[Tail Recursion] split an ordinary list by a large number: split_TailRecursion(4, List(1, 3)) = (List(1, 3), List())") {
    assert(P17.split_TailRecursion(4, List(1, 3)) === (List(1, 3), List()))
  }
  test("[Tail Recursion] split an empty list: split_TailRecursion(2, List()) = (List(), List())") {
    assert(P17.split_TailRecursion(2, List()) === (List(), List()))
  }
}


