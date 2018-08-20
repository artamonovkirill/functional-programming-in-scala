import GettingStarted._
import org.scalatest.Matchers
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class GettingStartedProperties extends JUnitPropSpec with GeneratorDrivenPropertyChecks with Matchers {
  property("absolute value is always positive") {
    forAll { n: Int =>
      abs(n) should be >= 0.toLong
    }
  }
  property("fibonacci number is a sum of previous two") {
    forAll { n: Int =>
      whenever(n > 1) {
        fibonacci(n) should equal(fibonacci(n - 1) + fibonacci(n - 2))
      }
    }
  }
}
