package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P24._
import common.MyListWrapper._

@RunWith(classOf[JUnitRunner])
class P24TestSuite extends FunSuite {
  test("lotto by selecting 4 from the set 1..9: lotto(4, 9)") {
    val res = P24.lotto(4, 9)
    assert(res.length === 4)
    assert(res isSub List.range(1, 9+1))
  }
  test("lotto by selecting 8 from the set 1..5: lotto(8, 5)") {
    val res = P24.lotto(8, 5)
    assert(res.length === 5)
    assert(res isSub List.range(1, 5+1))
  }
  test("lotto by selecting 3 from empty set: lotto(3, 0)") {
    val res = P24.lotto(3, 0)
    assert(res.length === 0)
    assert(res isSub List.range(1, 0+1))
  }
  test("lotto by selecting 0 from the set 1..9: lotto(0, 9)") {
    val res = P24.lotto(0, 9)
    assert(res.length === 0)
    assert(res isSub List.range(1, 9+1))
  }
  test("lotto by selecting -3 from the set 1..9: lotto(-3, 9)") {
    val res = P24.lotto(-3, 9)
    assert(res.length === 0)
    assert(res isSub List.range(1, 9+1))
  }
}
