package com.techma.deck;

/**
 * Enum which represents the possible values of a card, ace through king
 */
public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private static final int ACE_VALUE = 1;
    private static final int JACK_VALUE = 11;
    private static final int QUEEN_VALUE = 12;
    private static final int KING_VALUE = 13;

    private Integer value;

    private Rank(Integer value) {
        this.value = value;
    }

    /**
     * Retrieves the value
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Retrieves the friendly string representation of the rank
     */
    public String toString() {
        if (this.value == ACE_VALUE) {
            return "Ace";
        } else if (this.value > ACE_VALUE && this.value < JACK_VALUE) {
            return this.value.toString();
        } else if (this.value == JACK_VALUE) {
            return "Jack";
        } else if (this.value == QUEEN_VALUE) {
            return "Queen";
        } else if (this.value == KING_VALUE) {
            return "King";
        }

        return "";
    }
}
