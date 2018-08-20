import spock.lang.Specification

import static GettingStarted.fibonacci

class GettingStartedSpec extends Specification {

    def 'Calculates Fibonacci'() {
        expect:
        fibonacci(index) == value

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

}