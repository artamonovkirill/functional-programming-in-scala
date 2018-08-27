package datastructures

import datastructures.List.sum
import org.junit.runner.RunWith
import org.scalatest.{FunSpec, Matchers}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListFunSpec extends FunSpec with Matchers {
    describe ("A list") {
      it("calculates a sum") {
        sum(Nil) should be (0)
      }
    }
}
