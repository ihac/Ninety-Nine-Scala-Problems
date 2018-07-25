package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P22._

@RunWith(classOf[JUnitRunner])
class P22TestSuite extends FunSuite {
  test("range between two positive integers: range(4, 9) = List(4, 5, 6, 7, 8, 9)") {
    assert(P22.range(4, 9) === List(4, 5, 6, 7, 8, 9))
  }
  test("range between two negative integers: range(-5, -1) = List(-5, -4, -3, -2, -1)") {
    assert(P22.range(-5, -1) === List(-5, -4, -3, -2, -1))
  }
  test("range between two identical integers: range(2, 2) = List(2)") {
    assert(P22.range(2, 2) === List(2))
  }
  test("range between a negative integer and a positive integer: range(-2, 2) = List(-2, -1, 0, 1, 2)") {
    assert(P22.range(-2, 2) === List(-2, -1, 0, 1, 2))
  }
  test("range between two integers where the former is larger than the latter: range(4, 2) = List()") {
    assert(P22.range(4, 2) === List())
  }

  test("[Tail Recursion] range between two positive integers: range_TailRecursion(4, 9) = List(4, 5, 6, 7, 8, 9)") {
    assert(P22.range_TailRecursion(4, 9) === List(4, 5, 6, 7, 8, 9))
  }
  test("[Tail Recursion] range between two negative integers: range_TailRecursion(-5, -1) = List(-5, -4, -3, -2, -1)") {
    assert(P22.range_TailRecursion(-5, -1) === List(-5, -4, -3, -2, -1))
  }
  test("[Tail Recursion] range between two identical integers: range_TailRecursion(2, 2) = List(2)") {
    assert(P22.range_TailRecursion(2, 2) === List(2))
  }
  test("[Tail Recursion] range between a negative integer and a positive integer: range_TailRecursion(-2, 2) = List(-2, -1, 0, 1, 2)") {
    assert(P22.range_TailRecursion(-2, 2) === List(-2, -1, 0, 1, 2))
  }
  test("[Tail Recursion] range between two integers where the former is larger than the latter: range_TailRecursion(4, 2) = List()") {
    assert(P22.range_TailRecursion(4, 2) === List())
  }
}
