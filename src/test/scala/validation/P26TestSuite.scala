package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import WorkingWithLists.P26._
import math._
import common.MyListWrapper._

@RunWith(classOf[JUnitRunner])
class P26TestSuite extends FunSuite {
  test("combinations of 3 distinct objects from an ordinary set: combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))") {
    val res = P26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    assert(res.length === Combination.compute(6, 3))
    assert(res.forall(
      l => l.length == 3 && l.isSub(List('a, 'b, 'c, 'd, 'e, 'f))
    ))
  }
  test("combinations of 4 distinct objects from an ordinary set: combinations(3, List(2, 3, 1, 5, 6))") {
    val res = P26.combinations(4, List(2, 3, 1, 5, 6))
    assert(res.length === Combination.compute(5, 4))
    assert(res.forall(
      l => l.length == 4 && l.isSub(List(2, 3, 1, 5, 6))
    ))
  }
  test("combinations of 3 distinct objects from a three-item set: combinations(3, List(2, 3, 4))") {
    val res = P26.combinations(3, List(2, 3, 4))
    println(res)
    assert(res.length === Combination.compute(3, 3))
    assert(res.forall(
      l => l.length == 3 && l.isSub(List(2, 3, 4))
    ))
  }
  test("combinations of 1 distinct object from an ordinary set: combinations(1, List(2, 0, 1, 8))") {
    val res = P26.combinations(1, List(2, 0, 1, 8))
    assert(res.length === Combination.compute(4, 1))
    assert(res.forall(
      l => l.length == 1 && l.isSub(List(2, 0, 1, 8))
    ))
  }
  test("combinations of 0 distinct object from an ordinary set: combinations(0, List(2, 0, 1, 8))") {
    val res = P26.combinations(0, List(2, 0, 1, 8))
    assert(res === List(Nil))
  }
  test("combinations of 3 distinct objects from a two-item set: combinations(3, List(2, 3))") {
    intercept[IllegalArgumentException] {
      P26.combinations(3, List(2, 3))
    }
  }
  test("combinations of 3 distinct objects from an empty set: combinations(3, List())") {
    intercept[IllegalArgumentException] {
      P26.combinations(3, List())
    }
  }

  test("[FP] combinations of 3 distinct objects from an ordinary set: combinations_FP(3, List('a, 'b, 'c, 'd, 'e, 'f))") {
    val res = P26.combinations_FP(3, List('a, 'b, 'c, 'd, 'e, 'f))
    assert(res.length === Combination.compute(6, 3))
    assert(res.forall(
      l => l.length == 3 && l.isSub(List('a, 'b, 'c, 'd, 'e, 'f))
    ))
  }
  test("[FP] combinations of 4 distinct objects from an ordinary set: combinations_FP(3, List(2, 3, 1, 5, 6))") {
    val res = P26.combinations_FP(4, List(2, 3, 1, 5, 6))
    assert(res.length === Combination.compute(5, 4))
    assert(res.forall(
      l => l.length == 4 && l.isSub(List(2, 3, 1, 5, 6))
    ))
  }
  test("[FP] combinations of 3 distinct objects from a three-item set: combinations_FP(3, List(2, 3, 4))") {
    val res = P26.combinations_FP(3, List(2, 3, 4))
    assert(res.length === Combination.compute(3, 3))
    assert(res.forall(
      l => l.length == 3 && l.isSub(List(2, 3, 4))
    ))
  }
  test("[FP] combinations of 1 distinct object from an ordinary set: combinations_FP(1, List(2, 0, 1, 8))") {
    val res = P26.combinations_FP(1, List(2, 0, 1, 8))
    assert(res.length === Combination.compute(4, 1))
    assert(res.forall(
      l => l.length == 1 && l.isSub(List(2, 0, 1, 8))
    ))
  }
  test("[FP] combinations of 0 distinct object from an ordinary set: combinations_FP(0, List(2, 0, 1, 8))") {
    val res = P26.combinations_FP(0, List(2, 0, 1, 8))
    assert(res === List(Nil))
  }
//  test("[FP] combinations of 3 distinct objects from a two-item set: combinations_FP(3, List(2, 3))") {
//    intercept[IllegalArgumentException] {
//      WorkingWithLists.P26.combinations_FP(3, List(2, 3))
//    }
//  }
//  test("[FP] combinations of 3 distinct objects from an empty set: combinations_FP(3, List())") {
//    intercept[IllegalArgumentException] {
//      WorkingWithLists.P26.combinations_FP(3, List())
//    }
//  }
}
