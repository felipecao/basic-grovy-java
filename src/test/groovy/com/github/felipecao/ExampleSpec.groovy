package com.github.felipecao

import spock.lang.Specification

class ExampleSpec extends Specification {

    Example example

    def setup(){
        example = new Example()
    }

    def "test if Spock works"(){
        given:
        String input = "input"

        when:
        String output = example.getOutput(input)

        then:
        "input" == output
    }
}
