package com.techma.deck;

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

    private Integer value;

    private Rank(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public String toString() {
        if (this.value == 1) {
            return "ace";
        } else if (this.value > 1 && this.value < 11) {
            return this.value + "";
        } else if (this.value == 11) {
            return "jack";
        } else if (this.value == 12) {
            return "queen";
        } else if (this.value == 13) {
            return "king";
        }

        return "";
    }
}
