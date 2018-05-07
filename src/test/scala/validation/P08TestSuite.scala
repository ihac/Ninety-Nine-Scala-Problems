package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P08._

@RunWith(classOf[JUnitRunner])
class P08TestSuite extends FunSuite {
  test("compress an ordinary list: compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List('a, 'b, 'c, 'a, 'd, 'e)") {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }
  test("compress an ordinary list: compress(List(1, 1, 2, 1, 3, 5, 8)) = List(1, 2, 1, 3, 5, 8)") {
    assert(P08.compress(List(1, 1, 2, 1, 3, 5, 8)) === List(1, 2, 1, 3, 5, 8))
  }
  test("compress an one-item list: compress(List(3)) = List(3)") {
    assert(P08.compress(List(3)) === List(3))
  }
  test("compress an empty list: compress(List()) = List()") {
    assert(P08.compress(List()) === List())
  }
  test("[Tail Recursion] compress an ordinary list: compress_TailRecursion(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List('a, 'b, 'c, 'a, 'd, 'e)") {
    assert(P08.compress_TailRecursion(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }
  test("[Tail Recursion] compress an ordinary list: compress_TailRecursion(List(1, 1, 2, 1, 3, 5, 8)) = List(1, 2, 1, 3, 5, 8)") {
    assert(P08.compress_TailRecursion(List(1, 1, 2, 1, 3, 5, 8)) === List(1, 2, 1, 3, 5, 8))
  }
  test("[Tail Recursion] compress an one-item list: commpress_TailRecursion(List(3)) = List(3)") {
    assert(P08.compress_TailRecursion(List(3)) === List(3))
  }
  test("[Tail Recursion] compress an empty list: compress_TailRecursion(List()) = List()") {
    assert(P08.compress_TailRecursion(List()) === List())
  }
}


