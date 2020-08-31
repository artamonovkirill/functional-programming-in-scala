package gettingstarted

import java.lang.Integer.MIN_VALUE

import gettingstarted.GettingStarted._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GettingStartedSpec extends AnyFunSpec with Matchers {
  describe("Fibonacci") {
    it("is calculated correctly") {
      fibonacci(1) should be(0)
      fibonacci(2) should be(1)
      fibonacci(3) should be(1)
      fibonacci(4) should be(2)
      fibonacci(5) should be(3)
      fibonacci(6) should be(5)
      fibonacci(7) should be(8)
      fibonacci(8) should be(13)
    }

    it("of 63 is positive") {
      fibonacci(63) should be > 0.toFloat
    }
  }

  describe("absolute") {
    it("is positive") {
      abs(-42) should be(42)
    }
    it("handles max integer") {
      abs(MIN_VALUE) should be(2147483648L)
    }
  }

  it("factorial is calculated correctly") {
    factorial(7) should be(5040)
  }

  describe("findFirst") {
    it("finds first occurrence") {
      findFirst(Array(7, 9, 13), (x: Int) => x == 9) should be(1)
      findFirst(Array("foo"), (x: String) => x == "foo") should be(0)
      findFirst(Array(1, 2), (x: Int) => x > 1) should be(1)
    }
    it("returns -1 when no match is found") {
      findFirst(Array("foo"), (x: String) => x == "bar") should be(-1)
    }
    it("returns -1 for empty arrays") {
      findFirst(Array(), (_: Object) => true) should be(-1)
      findFirst(Array(), (_: Object) => false) should be(-1)
    }
  }

  describe("isSorted") {
    it("is true for empty arrays") {
      isSorted(Array(), (_: Object, _: Object) => true) should be(true)
      isSorted(Array(), (_: Object, _: Object) => false) should be(true)
    }
    it("is true for singleton arrays") {
      isSorted(Array(1), (_: Int, _: Int) => true) should be(true)
      isSorted(Array(1), (_: Int, _: Int) => false) should be(true)
    }
    it("is true for sorted arrays") {
      isSorted(Array(1, 2, 3), (a: Int, b: Int) => a < b) should be(true)
    }
    it("is false for not sorted arrays") {
      isSorted(Array(2, 3, 1), (a: Int, b: Int) => a < b) should be(false)
    }
  }
}
