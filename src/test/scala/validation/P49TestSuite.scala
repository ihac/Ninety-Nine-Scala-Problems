package validation

import LogicAndCodes.P49._

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P49TestSuite extends FunSuite {
  test("gray code in 1 bit: gray(1) == List(0, 1))") {
    P49.gray(1) === List("0", "1")
  }
  test("gray code in 2 bit: gray(2) == List(00, 01, 11, 10))") {
    P49.gray(2) === List("00", "01", "11", "10")
  }
  test("gray code in 3 bit: gray(3)") {
    P49.gray(3) === List("000", "001", "011", "010", "110", "111", "101", "100")
  }
}
