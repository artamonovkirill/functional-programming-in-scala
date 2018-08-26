import GettingStarted._
import org.scalatest.Matchers
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class GettingStartedProperties extends JUnitPropSpec with GeneratorDrivenPropertyChecks with Matchers {
  property("absolute") {
    forAll { n: Int =>
      abs(n) should be >= 0.toLong
    }
  }
  property("fibonacci") {
    forAll { n: Short =>
      whenever(n > 1) {
        fibonacci(n) should equal(fibonacci((n - 1).toShort) + fibonacci((n - 2).toShort))
        fibonacci(n) should be > 0.toFloat
      }
    }
  }
}
