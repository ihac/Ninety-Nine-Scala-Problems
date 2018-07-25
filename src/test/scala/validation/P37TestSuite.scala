package validation

import Arithmetic.P37.P37._
import org.junit.runner.RunWith
import org.scalacheck.Prop.forAll
import org.scalacheck.Prop.BooleanOperators
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P37TestSuite extends FunSuite {
  test("totient_improve should always be consistent with totient") {
    import Arithmetic.P34.P34._
    val prop = forAll { n: Int =>
      (n > 0 && n < 100000) ==> (n.totient == n.totient_improve)
    }
    prop.check()
  }

  /**
    * There is no need to test totient_improve by specific cases, since we've
    * already proved that its result is always consistent with totient', which's
    * proved to be correct in solution 34.
    */
}
