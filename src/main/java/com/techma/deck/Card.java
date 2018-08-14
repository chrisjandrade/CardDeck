package com.techma.deck;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object that) {
        Card thatCard = (Card) that;
        return this.rank.equals(thatCard.getRank()) && this.suit.equals(thatCard.getSuit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public int compareTo(Card that) {
        if (this.rank.getValue().equals(that.getRank().getValue())) {
            return 0;
        } else if (this.rank.getValue() < that.getRank().getValue()) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.rank.toString());
        builder.append(" of ");
        builder.append(this.suit.getValue());

        return builder.toString();
    }
}

