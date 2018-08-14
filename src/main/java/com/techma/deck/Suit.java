package com.techma.deck;

public enum Suit {
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    CLUBS("clubs"),
    SPADES("spades");

    private final String value;

    private Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

