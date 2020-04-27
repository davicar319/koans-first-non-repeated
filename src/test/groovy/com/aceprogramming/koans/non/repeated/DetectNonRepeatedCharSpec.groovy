package com.aceprogramming.koans.non.repeated

import spock.lang.Specification
import spock.lang.Unroll

class DetectNonRepeatedCharSpec extends Specification {
    def nonRepeatingCharacterFinder = new NonRepeatingCharacterFinderBase()

    def "canary test"() {
        expect:
        nonRepeatingCharacterFinder
    }

    @Unroll
    def "test #input produces #expectedResult"(def input, def expectedResult) {
        expect:
        nonRepeatingCharacterFinder.findFirst(input) == expectedResult

        where:
        input  | expectedResult
        "a"     | Optional.of(new NonRepeatingCharacter((char)'a', 0))


    }
}
