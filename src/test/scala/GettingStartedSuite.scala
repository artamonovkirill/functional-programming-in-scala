import GettingStarted.abs
import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.scalatest.prop.Checkers

class GettingStartedSuite extends JUnitSuite with Checkers {
  @Test
  def testAbs() {
    check((a: Int) => abs(a) >= 0)
  }
}
