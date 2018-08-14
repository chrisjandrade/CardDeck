package com.techma.deck;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Represents a card deck")
public class DeckTest {

  @DisplayName("Allows you to construct a new deck of cards")
  @Test
  public void testConstruct() {
    Deck deck = new Deck();
    assertEquals((int) 52, deck.getNumCards());
  }

  @DisplayName("Allows you to deal one card from the deck, reducing the number of cards by one")
  @Test
  public void testDealOneCard_reduce() {
    Deck deck = new Deck();
    Card c = deck.dealOneCard();

    assertEquals((int) 51, deck.getNumCards());
    assertNotEquals(null, c);
  }

  @DisplayName("Allows you to deal all cards until there are none")
  @Test
  public void testDealOneCard_dealAll() {
    Deck deck = new Deck();
    
    for (int i = 0; i < 53; i++) {
      deck.dealOneCard();
    }

    Card c = deck.dealOneCard();
    assertEquals(null, c);
    assertEquals(0, deck.getNumCards());
  }
}
