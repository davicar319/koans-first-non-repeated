package com.aceprogramming.koans.non.repeated;

import java.util.Optional;

public class NonRepeatingCharacterFinderBase {

    public Optional<NonRepeatingCharacter> findFirst(String s) {
        return Optional.of(new NonRepeatingCharacter(s.charAt(0), 0));
    }
}
