package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P09._

@RunWith(classOf[JUnitRunner])
class P09TestSuite extends FunSuite {
  test("pack an ordinary list: pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))") {
    assert(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
  test("pack an ordinary list: pack(List(1, 1, 2, 1, 3, 5, 8)) = List(1, 2, 1, 3, 5, 8)") {
    assert(P09.pack(List(1, 1, 2, 1, 3, 5, 8)) === List(List(1, 1), List(2), List(1), List(3), List(5), List(8)))
  }
  test("pack an one-item list: pack(List(3)) = List(3)") {
    assert(P09.pack(List(3)) === List(List(3)))
  }
  test("pack an empty list: pack(List()) = List()") {
    assert(P09.pack(List()) === List())
  }
  test("[Tail Recursion] pack an ordinary list: pack_TailRecursion(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))") {
    assert(P09.pack_TailRecursion(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
  test("[Tail Recursion] pack an ordinary list: pack_TailRecursion(List(1, 1, 2, 1, 3, 5, 8)) = List(1, 2, 1, 3, 5, 8)") {
    assert(P09.pack_TailRecursion(List(1, 1, 2, 1, 3, 5, 8)) === List(List(1, 1), List(2), List(1), List(3), List(5), List(8)))
  }
  test("[Tail Recursion] pack an one-item list: pack_TailRecursion(List(3)) = List(3)") {
    assert(P09.pack_TailRecursion(List(3)) === List(List(3)))
  }
  test("[Tail Recursion] pack an empty list: pack_TailRecursion(List()) = List()") {
    assert(P09.pack_TailRecursion(List()) === List())
  }
}


