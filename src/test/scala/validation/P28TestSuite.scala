package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P28._
import common.MyListWrapper._

@RunWith(classOf[JUnitRunner])
class P28TestSuite extends FunSuite {
  test("lsort an ordinary list: lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))") {
    val res = P28.lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    assert(res === List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l)))
  }

  test("lsort an ordinary list: lsort(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))") {
    val res = P28.lsort(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))
    assert(res === List(List(3), List(1, 2), List(7, 8), List(4, 5, 6)))
  }

  test("lsortFreq an ordinary list: lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))") {
    val res = P28.lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    assert(res === List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

  test("lsortFreq an ordinary list: lsortFreq(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))") {
    val res = P28.lsortFreq(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))
    assert(res === List(List(3), List(4, 5, 6), List(1, 2), List(7, 8)))
  }

  test("[TempVar] lsortFreq an ordinary list: lsortFreq_TempVar(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))") {
    val res = P28.lsortFreq_TempVar(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    assert(res === List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

  test("[TempVar] lsortFreq an ordinary list: lsortFreq_TempVar(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))") {
    val res = P28.lsortFreq_TempVar(List(List(1, 2), List(3), List(4, 5, 6), List(7, 8)))
    assert(res === List(List(3), List(4, 5, 6), List(1, 2), List(7, 8)))
  }
}
