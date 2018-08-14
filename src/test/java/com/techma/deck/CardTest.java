package com.techma.deck;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;;

@DisplayName("Card represents a playing card")
public class CardTest {

  @DisplayName("Can create a card with a given rank and suit")
  @Test
  public void constructCard() {
    Card card = new Card(Rank.ACE, Suit.SPADES);

    assertEquals((Integer) 1, card.getRank().getValue());
    assertEquals("spades", card.getSuit().getValue());
  }

  @DisplayName("Can set the values via setters")
  @Test
  public void testSetters() {
    Card card = new Card(Rank.EIGHT, Suit.DIAMONDS);
    card.setRank(Rank.ACE);
    card.setSuit(Suit.SPADES);

    assertEquals((Integer) 1, card.getRank().getValue());
    assertEquals("spades", card.getSuit().getValue());
  }

  @DisplayName("Can retrieve the values via getters")
  @Test
  public void testGetters() {
    Card card = new Card(Rank.ACE, Suit.SPADES);

    assertEquals((Integer) 1, card.getRank().getValue());
    assertEquals("spades", card.getSuit().getValue());
  }

  @DisplayName("Can determine whether or not two cards are the same")
  @Test
  public void testEquals() {
    Card card = new Card(Rank.ACE, Suit.CLUBS);
    Card _card = new Card(Rank.ACE, Suit.HEARTS);

    assertTrue(!card.equals(_card));
  }

  @DisplayName("Can compare one card to another")
  @Test
  public void testCompareTo() {
    Card card = new Card(Rank.ACE, Suit.CLUBS);
    Card _card = new Card(Rank.ACE, Suit.HEARTS);

    assertEquals((int) 0, card.compareTo(_card));

    card.setRank(Rank.ACE);
    _card.setRank(Rank.TWO);

    assertEquals((int) -1, card.compareTo(_card));

    card.setRank(Rank.TWO);
    _card.setRank(Rank.ACE);

    assertEquals((int) 1, card.compareTo(_card));
  }

  @DisplayName("Can display a friendly name for a card")
  @Test
  public void testToString() {
    Card card = new Card(Rank.ACE, Suit.SPADES);
    assertEquals("ace of spades", card.toString());
  }
}
