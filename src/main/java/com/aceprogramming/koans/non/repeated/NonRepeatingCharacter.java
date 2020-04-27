package com.aceprogramming.koans.non.repeated;

import java.util.Objects;

public class NonRepeatingCharacter {
    private final char c;
    private final int i;

    public NonRepeatingCharacter(char c, int i) {
        this.c = c;
        this.i = i;
    }

    public char getCharacter() {
        return c;
    }

    public int getIndex() {
        return i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonRepeatingCharacter that = (NonRepeatingCharacter) o;
        return c == that.c &&
                i == that.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c, i);
    }

    @Override
    public String toString() {
        return "NonRepeatingCharacter{" +
                "c=" + c +
                ", i=" + i +
                '}';
    }
}
