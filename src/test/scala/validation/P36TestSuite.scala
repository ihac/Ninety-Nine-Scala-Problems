package validation

import Arithmetic.P36.P36._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalacheck.Prop._

@RunWith(classOf[JUnitRunner])
class P36TestSuite extends FunSuite {
  test("results of primeFactorMultiplicity should always be consistent with primeFactors'") {
    import Arithmetic.P35.P35._
    import WorkingWithLists.P12.P12._
    val prop = forAll { (n: Int) =>
      val decoded = decode(n.primeFactorMultiplicity map (_.swap))
      n.primeFactors == decoded
    }
    prop.check()
  }

  test("factor must be prime and multiplicity must be positive") {
    import Arithmetic.P31.P31._
    val prop = forAll { (n: Int) =>
      val res = n.primeFactorMultiplicity
      res forall { case (f, m) => f.isPrime && m > 0 }
    }
  }

  test("[Direct] results of primeFactorMultiplicity should always be consistent with primeFactors'") {
    import Arithmetic.P35.P35._
    import WorkingWithLists.P12.P12._
    val prop = forAll { (n: Int) =>
      val decoded = decode(n.primeFactorMultiplicity_Direct map (_.swap))
      n.primeFactors == decoded
    }
    prop.check()
  }

  test("[Direct] factor must be prime and multiplicity must be positive") {
    import Arithmetic.P31.P31._
    val prop = forAll { (n: Int) =>
      val res = n.primeFactorMultiplicity_Direct
      res forall { case (f, m) => f.isPrime && m > 0 }
    }
  }

  /**
    * There is no need to test primeFactorMultiplicity by specific cases, since we've
    * already proved that its result is always consistent with primeFactors', which's
    * proved to be correct in the last solution.
    */
}
