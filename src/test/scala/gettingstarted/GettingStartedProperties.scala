package gettingstarted

import gettingstarted.GettingStarted._
import org.scalatest.matchers.should.Matchers
import org.scalatest.propspec.AnyPropSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks.{forAll, whenever}

class GettingStartedProperties extends AnyPropSpec with Matchers {
  forAll { n: Int =>
    abs(n) should be >= 0.toLong
  }

  forAll { n: Short =>
    whenever(n > 1) {
      fibonacci(n) should equal(fibonacci((n - 1).toShort) + fibonacci((n - 2).toShort))
      fibonacci(n) should be > 0.toFloat
    }
  }

}
