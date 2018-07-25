package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P15._

@RunWith(classOf[JUnitRunner])
class P15TestSuite extends FunSuite {
  test("[Flat Map] duplicateN an ordinary list: duplicateN_FlatMap(3, List('a, 'b, 'c, 'c, 'd)) = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)") {
    assert(P15.duplicateN_FlatMap(3, List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
  test("[Flat Map] duplicateN an ordinary list by 1: duplicateN_FlatMap(1, List(1, 3, 2, 8)) = List(1, 3, 2, 8)") {
    assert(P15.duplicateN_FlatMap(1, List(1, 3, 2, 8)) === List(1, 3, 2, 8))
  }
  test("[Flat Map] duplicateN an ordinary list by 0: duplicateN_FlatMap(0, List(3)) = List()") {
    assert(P15.duplicateN_FlatMap(0, List(3)) === List())
  }
  test("[Flat Map] duplicateN an empty list: duplicateN_FlatMap(3, List()) = List()") {
    assert(P15.duplicateN_FlatMap(3, List()) === List())
  }
  test("[Fold Right] duplicateN an ordinary list: duplicateN_FoldRight(3, List('a, 'b, 'c, 'c, 'd)) = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)") {
    assert(P15.duplicateN_FoldRight(3, List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
  test("[Fold Right] duplicateN an ordinary list by 1: duplicateN_FoldRight(1, List(1, 3, 2, 8)) = List(1, 3, 2, 8)") {
    assert(P15.duplicateN_FoldRight(1, List(1, 3, 2, 8)) === List(1, 3, 2, 8))
  }
  test("[Fold Right] duplicateN an ordinary list by 0: duplicateN_FoldRight(0, List(3)) = List()") {
    assert(P15.duplicateN_FoldRight(0, List(3)) === List())
  }
  test("[Fold Right] duplicateN an empty list: duplicateN_FoldRight(3, List()) = List()") {
    assert(P15.duplicateN_FoldRight(3, List()) === List())
  }
}
