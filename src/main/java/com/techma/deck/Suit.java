package com.techma.deck;

import org.apache.commons.lang.StringUtils;

/**
 * Enum which represents the suit of a card
 */
public enum Suit {
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    CLUBS("clubs"),
    SPADES("spades");

    private final String value;

    private Suit(String value) {
        this.value = value;
    }

    /**
     * Represents the value of a suit
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Printable value of the suit
     */
    public String toString() {
        return StringUtils.capitalize(this.value);
    }
}

