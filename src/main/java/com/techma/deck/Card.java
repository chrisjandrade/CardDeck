package com.techma.deck;

import java.util.Objects;

/**
 * Class which represents a playing card
 */
public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;

    /**
     * Constructs a card instance
     */
    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Retrieves the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Sets the rank
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * Gets the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Sets the suit
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * Determines if two cards are the same
     */
    @Override
    public boolean equals(Object that) {
        Card thatCard = (Card) that;
        return this.rank.equals(thatCard.getRank()) && this.suit.equals(thatCard.getSuit());
    }

    /**
     * Generate a unique hash code for the card
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    /**
     * Compares the value of two playing cards
     */
    public int compareTo(Card that) {
        if (this.rank.getValue().equals(that.getRank().getValue())) {
            return 0;
        } else if (this.rank.getValue() < that.getRank().getValue()) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Generates a friendly string for the card
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.rank.toString());
        builder.append(" of ");
        builder.append(this.suit.getValue());

        return builder.toString();
    }
}

