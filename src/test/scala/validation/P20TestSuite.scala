package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P20._

@RunWith(classOf[JUnitRunner])
class P20TestSuite extends FunSuite {
  test("removeAt an ordinary list: removeAt(1, List('a, 'b, 'c, 'd)) = (List('a, 'c, 'd),'b)") {
    assert(P20.removeAt(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }
  test("removeAt an ordinary list: removeAt(2, List(1, 3, 2, 8)) = (List(1, 3, 8), 2)") {
    assert(P20.removeAt(2, List(1, 3, 2, 8)) === (List(1, 3, 8), 2))
  }
  test("removeAt an ordinary list by a out-of-bound number: removeAt(-2, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt(-2, List(1, 2, 3, 4))
    }
  }
  test("removeAt an ordinary list by a out-of-bound number: removeAt(5, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt(5, List(1, 2, 3, 4))
    }
  }
  test("removeAt an empty list: removeAt(3, List()) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt(3, List())
    }
  }

  test("[FP] removeAt an ordinary list: removeAt_FP(1, List('a, 'b, 'c, 'd)) = (List('a, 'c, 'd),'b)") {
    assert(P20.removeAt_FP(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }
  test("[FP] removeAt an ordinary list: removeAt_FP(2, List(1, 3, 2, 8)) = (List(1, 3, 8), 2)") {
    assert(P20.removeAt_FP(2, List(1, 3, 2, 8)) === (List(1, 3, 8), 2))
  }
  test("[FP] removeAt an ordinary list by a out-of-bound number: removeAt_FP(-2, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_FP(-2, List(1, 2, 3, 4))
    }
  }
  test("[FP] removeAt an ordinary list by a out-of-bound number: removeAt_FP(5, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_FP(5, List(1, 2, 3, 4))
    }
  }
  test("[FP] removeAt an empty list: removeAt_FP(3, List()) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_FP(3, List())
    }
  }

  test("[Split] removeAt an ordinary list: removeAt_Split(1, List('a, 'b, 'c, 'd)) = (List('a, 'c, 'd),'b)") {
    assert(P20.removeAt_Split(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }
  test("[Split] removeAt an ordinary list: removeAt_Split(2, List(1, 3, 2, 8)) = (List(1, 3, 8), 2)") {
    assert(P20.removeAt_Split(2, List(1, 3, 2, 8)) === (List(1, 3, 8), 2))
  }
  test("[Split] removeAt an ordinary list by a out-of-bound number: removeAt_Split(-2, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_Split(-2, List(1, 2, 3, 4))
    }
  }
  test("[Split] removeAt an ordinary list by a out-of-bound number: removeAt_Split(5, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_Split(5, List(1, 2, 3, 4))
    }
  }
  test("[Split] removeAt an empty list: removeAt_Split(3, List()) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_Split(3, List())
    }
  }

  test("[Tail Recursion] removeAt an ordinary list: removeAt_TailRecursion(1, List('a, 'b, 'c, 'd)) = (List('a, 'c, 'd),'b)") {
    assert(P20.removeAt_TailRecursion(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }
  test("[Tail Recursion] removeAt an ordinary list: removeAt_TailRecursion(2, List(1, 3, 2, 8)) = (List(1, 3, 8), 2)") {
    assert(P20.removeAt_TailRecursion(2, List(1, 3, 2, 8)) === (List(1, 3, 8), 2))
  }
  test("[Tail Recursion] removeAt an ordinary list by a out-of-bound number: removeAt_TailRecursion(-2, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_TailRecursion(-2, List(1, 2, 3, 4))
    }
  }
  test("[Tail Recursion] removeAt an ordinary list by a out-of-bound number: removeAt_TailRecursion(5, List(1, 2, 3, 4)) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_TailRecursion(5, List(1, 2, 3, 4))
    }
  }
  test("[Tail Recursion] removeAt an empty list: removeAt_TailRecursion(3, List()) = NoSuchElementException") {
    intercept[java.util.NoSuchElementException] {
      P20.removeAt_TailRecursion(3, List())
    }
  }
}
