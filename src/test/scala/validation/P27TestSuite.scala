package validation

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import P27._
import math._

@RunWith(classOf[JUnitRunner])
class P27TestSuite extends FunSuite {
  test("group3 of an ordinary list: group3(List(\"Aldo\", \"Beat\", \"Carla\", \"David\", \"Evi\", \"Flip\", \"Gary\", \"Hugo\", \"Ida\"))") {
    val res = P27.group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    assert(
      res.length === Combination.compute(9, 2) * Combination.compute(7, 3)
    )
    assert(
      res.head === List(List("Aldo", "Beat"), List("Carla", "David", "Evi"), List("Flip", "Gary", "Hugo", "Ida"))
    )
  }

  test("group3 of an ordinary list: group3(List(1, 2, 3, 4, 5, 6, 7, 8, 9))") {
    val res = P27.group3(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
    assert(
      res.length === Combination.compute(9, 2) * Combination.compute(7, 3)
    )
    assert(
      res.head === List(List(1, 2), List(3, 4, 5), List(6, 7, 8, 9))
    )
  }
  test("group(2, 3, 4) of an ordinary list should have the same result as group3: group(List(2, 3, 4), List(\"Aldo\", \"Beat\", \"Carla\", \"David\", \"Evi\", \"Flip\", \"Gary\", \"Hugo\", \"Ida\"))") {
    val res1 = P27.group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    val res2 = P27.group(List(2, 3, 4), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    assert(res1 === res2)
  }
  test("group(2, 3, 4) of an ordinary list should have the same result as group3: group(List(2, 3, 4), List(1, 2, 3, 4, 5, 6, 7, 8, 9)") {
    val res1 = P27.group3(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
    val res2 = P27.group(List(2, 3, 4), List(1, 2, 3, 4, 5, 6, 7, 8, 9))
    assert(res1 === res2)
  }
  test("group(3, 3, 3) of an ordinary list: group(List(3, 3, 3), List(1, 2, 3, 4, 5, 6, 7, 8, 9)") {
    val res = P27.group(List(3, 3, 3), List(1, 2, 3, 4, 5, 6, 7, 8, 9))
    assert(res.length === Combination.compute(9, 3) * Combination.compute(6, 3))
  }
  test("group(3) of an ordinary list: group(List(3), List(1, 2, 3)") {
    val res = P27.group(List(3), List(1, 2, 3))
    assert(res === List(List(List(1, 2, 3))))
  }
}
