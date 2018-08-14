package com.techma.deck;

import java.util.Random;

/**
 * Class which represents a deck of cards
 */
public class Deck {

    private static final int NUM_CARDS = 52;

    private Card[] cards;
    private int numCards = 0;

    /**
     * Constructs the deck of cards
     */
    Deck() {
        this.cards = new Card[NUM_CARDS];

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[this.numCards++] = new Card(rank, suit);
            }
        }
    }

    /**
     * Returns the number of cards
     */
    public int getNumCards() {
        return this.numCards;
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

        if (index >= 0) {
            this.numCards--;
            return this.cards[index];
        } else {
            return null;
        }
    }

    /**
     * Creates a deck of cards, shuffles them and deals them until there are no cards left
     */
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
