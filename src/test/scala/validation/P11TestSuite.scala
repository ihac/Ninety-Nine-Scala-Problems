package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import WorkingWithLists.P11._

@RunWith(classOf[JUnitRunner])
class P11TestSuite extends FunSuite {
  test("encodeModified an ordinary list: encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))") {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
  test("encodeModified an ordinary list: encodeModified(List(1, 1, 2, 1, 3, 5, 8)) = List((2, 1), 2, 1, 3, 5, 8)") {
    assert(P11.encodeModified(List(1, 1, 2, 1, 3, 5, 8)) === List((2, 1), 2, 1, 3, 5, 8))
  }
  test("encodeModified an one-item list: encodeModified(List(3)) = List(3)") {
    assert(P11.encodeModified(List(3)) === List(3))
  }
  test("encodeModified an empty list: encodeModified(List()) = List()") {
    assert(P11.encodeModified(List()) === List())
  }
}
