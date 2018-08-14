package com.techma.deck;

import java.util.Random;

public class Deck {

    private static final int NUM_CARDS = 52;

    private Card[] cards;
    private int numCards = 52;

    Deck() {
        this.cards = new Card[NUM_CARDS];

        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) cards[i++] = new Card(rank, suit);
        }
    }

    /**
     * Shuffles the cards
     */
    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < this.numCards; i++) {
            int ith = random.nextInt(this.numCards);
            int jth = random.nextInt(this.numCards);

            swap(ith, jth);
        }
    }

    /**
     * Swaps the position of two cards in the deck
     * @param i Index of i-th card
     * @param j Index of j-th card
     */
    private void swap(int i, int j) {
        Card ith = this.cards[i];
        Card jth = this.cards[j];

        this.cards[i] = jth;
        this.cards[j] = ith;
    }

    /**
     * Deals one card from the deck, this reduces the deck size by one
     * @return A card from the top of the deck
     */
    public Card dealOneCard() {
        int index = this.numCards - 1;
        this.numCards--;

        if (index >= 0) {
            return this.cards[index];
        } else {
            return null;
        }
    }

    public static void main(String args[]) {

        Deck deck = new Deck();

        deck.shuffle();
        for (int i = 0; i < 54; i++) {
            Card card = deck.dealOneCard();

            if (card != null) {
                System.out.println((i + 1) +": " + card.toString());
            } else {
                System.out.println("No more cards to deal");
            }
        }

    }

}
