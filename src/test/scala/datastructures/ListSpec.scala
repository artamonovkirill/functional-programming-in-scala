package datastructures

import datastructures.List.sum
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ListSpec extends AnyFunSpec with Matchers {
    describe ("A list") {
      it("calculates a sum") {
        sum(Nil) should be (0)
      }
    }
}
