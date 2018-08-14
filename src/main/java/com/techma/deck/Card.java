package com.techma.deck;

import java.util.Objects;

/**
 * Class which represents a playing card
 */
public class Card implements Comparable<Card> {

    private static final String _OF_ = " of ";

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
        return this.rank;
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
        return this.suit;
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
        return Objects.hash(this.rank, this.suit);
    }

    /**
     * Compares the value of two playing cards
     */
    public int compareTo(Card that) {
        return this.rank.getValue().compareTo(that.getRank().getValue());
    }

    /**
     * Generates a friendly string for the card
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.rank.toString());
        builder.append(_OF_);
        builder.append(this.suit.toString());

        return builder.toString();
    }
}

