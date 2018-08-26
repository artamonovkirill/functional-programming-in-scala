import spock.lang.Specification

import static GettingStarted.abs
import static GettingStarted.factorial
import static GettingStarted.fibonacci
import static GettingStarted.findFirst
import static GettingStarted.isSorted
import static java.lang.Integer.MIN_VALUE

class GettingStartedSpec extends Specification {

    def 'Calculates Fibonacci'() {
        expect:
        fibonacci(index as Short) == value

        where:
        index | value
        1     | 0
        2     | 1
        3     | 1
        4     | 2
        5     | 3
        6     | 5
        7     | 8
        8     | 13
    }

    def 'Fibonacci numbers are positive'() {
        expect:
        fibonacci(63 as Short) > 0
    }

    def 'Calculates absolute value'() {
        expect:
        abs(-42) == 42
    }

    def 'Abs handles min integer'() {
        expect:
        abs(MIN_VALUE) == 2147483648
    }

    def 'Calculates factorial'() {
        expect:
        factorial(7) == 5040
    }

    def 'Finds first occurrence'() {
        expect:
        findFirst([7, 9, 13] as Integer[], { x -> x == 9 }) == 1
        findFirst([] as Object[], { -> }) == -1
        findFirst(['foo'] as String[], { x -> x == 'foo' }) == 0
        findFirst(['foo'] as String[], { x -> x == 'bar' }) == -1
        findFirst([1, 2] as Integer[], { x -> x > 1 }) == 1
    }

    def 'Checks if sorted'() {
        expect:
        isSorted([] as Object[], { a, b -> })
        isSorted([1] as Integer[], { a, b -> })
        isSorted([1, 2, 3] as Integer[], { a, b -> a < b })
        !isSorted([2, 3, 1] as Integer[], { a, b -> a < b })
    }

}