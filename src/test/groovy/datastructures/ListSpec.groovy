package datastructures


import spock.lang.Specification

class ListSpec extends Specification {

    def 'calculates a sum'() {
        expect:
        List$.MODULE$.sum(Nil.instance()) == 0
    }

}
