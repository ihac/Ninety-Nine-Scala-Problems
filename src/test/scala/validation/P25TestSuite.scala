package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P25._
import common.MyListWrapper._

@RunWith(classOf[JUnitRunner])
class P25TestSuite extends FunSuite {
  test("randomPermute an ordinary set: randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))") {
    val res = P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    assert(res.length === List('a, 'b, 'c, 'd, 'e, 'f).length)
    assert(res isSub List('a, 'b, 'c, 'd, 'e, 'f))
  }
  test("randomPermute an ordinary set: randomPermute(List(1, 2, 3, 4, 5))") {
    val res = P25.randomPermute(List(1, 2, 3, 4, 5))
    assert(res.length === List(1, 2, 3, 4, 5).length)
    assert(res isSub List(1, 2, 3, 4, 5))
  }
  test("randomPermute a one-item set: randomPermute(List(3))") {
    val res = P25.randomPermute(List(3))
    assert(res.length === List(3).length)
    assert(res === List(3))
  }
  test("randomPermute an empty set: randomPermute(List())") {
    val res = P25.randomPermute(List())
    assert(res === Nil)
  }

  test("[Tail Recursion] randomPermute_TailRecursion an ordinary set: randomPermute_TailRecursion(List('a, 'b, 'c, 'd, 'e, 'f))") {
    val res = P25.randomPermute_TailRecursion(List('a, 'b, 'c, 'd, 'e, 'f))
    assert(res.length === List('a, 'b, 'c, 'd, 'e, 'f).length)
    assert(res isSub List('a, 'b, 'c, 'd, 'e, 'f))
  }
  test("[Tail Recursion] randomPermute_TailRecursion an ordinary set: randomPermute_TailRecursion(List(1, 2, 3, 4, 5))") {
    val res = P25.randomPermute_TailRecursion(List(1, 2, 3, 4, 5))
    assert(res.length === List(1, 2, 3, 4, 5).length)
    assert(res isSub List(1, 2, 3, 4, 5))
  }
  test("[Tail Recursion] randomPermute_TailRecursion a one-item set: randomPermute_TailRecursion(List(3))") {
    val res = P25.randomPermute_TailRecursion(List(3))
    assert(res.length === List(3).length)
    assert(res === List(3))
  }
  test("[Tail Recursion] randomPermute_TailRecursion an empty set: randomPermute_TailRecursion(List())") {
    val res = P25.randomPermute_TailRecursion(List())
    assert(res === Nil)
  }
}
