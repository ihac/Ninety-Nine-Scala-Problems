package validation

import Arithmetic.P35.P35._
import org.junit.runner.RunWith
import org.scalacheck.{Prop, Properties}
import org.scalacheck.Prop._
import org.scalatest.FunSuite
import org.scalatest.exceptions.TestFailedException
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P35TestSuite extends FunSuite {
  test("a prime number has only one prime factor: 7.primeFactors == List(7)") {
    assert(7.primeFactors === List(7))
  }

  test("a number might have duplicate prime factors: 8.primeFactors == List(2, 2, 2)") {
    assert(8.primeFactors === List(2, 2, 2))
  }

  test("numbers smaller than 2 have no prime factor: 1.primeFactors == Nil") {
    assert(1.primeFactors === Nil)
  }

  test("numbers smaller than 2 have no prime factor: 0.primeFactors == Nil") {
    assert(0.primeFactors === Nil)
  }

  test("prime factors of an ordinary number: 45.primeFactors == List(3, 3, 5)") {
    assert(45.primeFactors === List(3, 3, 5))
  }

  test("all factors should be prime") {
    val prop = forAll { (n: Int) =>
      import Arithmetic.P31.P31._
      n.primeFactors forall (_.isPrime)
    }
    prop.check()
  }

  test("factors should be in increasing order") {
    val prop = forAll { (n: Int) =>
      val res = n.primeFactors
      res == res.sorted
    }
    prop.check()
  }
}
