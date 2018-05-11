package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import P23._

object MyListConvertion {
  implicit def toMyList[T](l: List[T]): MyList[T] = new MyList[T](l)

  class MyList[T](v: List[T]) {
    def removeAt(i: Int): List[T] = v.splitAt(i) match {
      case (start, h::tail) => start:::tail
      case _ => throw new java.util.NoSuchElementException
    }
    def isSub(that: List[T]): Boolean = v match {
        case h :: tail => that.contains(h) && tail.isSub(that.removeAt(that.indexWhere(_ == h)))
        case Nil => true
    }
  }
}


@RunWith(classOf[JUnitRunner])
class P23TestSuite extends FunSuite {
  import MyListConvertion._
  test("randomSelect from an ordinary list: randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))") {
    val res = P23.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    assert(res.length === 3)
    assert(res isSub List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  }
  test("randomSelect from an ordinary list: randomSelect(4, List(1, 2, 3, 4, 4, 5, 6))") {
    val res = P23.randomSelect(4, List(1, 2, 3, 4, 4, 5, 6))
    assert(res.length === 4)
    assert(res isSub List(1, 2, 3, 4, 4, 5, 6))
  }
  test("randomSelect from an ordinary list by a large number: randomSelect(5, List(1, 2, 3))") {
    val res = P23.randomSelect(5, List(1, 2, 3))
    assert(res.length === 3)
    assert(res isSub List(1, 2, 3))
  }
  test("randomSelect from an ordinary list by a negative number: randomSelect(-3, List(1, 2, 3, 4, 5))") {
    val res = P23.randomSelect(-3, List(1, 2, 3, 4, 5))
    assert(res.length === 0)
    assert(res isSub List(1, 2, 3, 4, 5))
  }
  test("randomSelect from an ordinary list by 0: randomSelect(0, List(1, 2, 3, 4, 5))") {
    val res = P23.randomSelect(0, List(1, 2, 3, 4, 5))
    assert(res.length === 0)
    assert(res isSub List(1, 2, 3, 4, 5))
  }
  test("randomSelect from an empty list: randomSelect(3, List())") {
    val res = P23.randomSelect(3, List())
    assert(res.length === 0)
    assert(res isSub List())
  }
}
