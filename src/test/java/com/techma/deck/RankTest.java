package com.techma.deck;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Represents a cards value 1 through 13")
public class RankTest {

  @DisplayName("Can construct a cards rank")
  @Test
  public void testConstruct() {
    Rank rank = Rank.ACE;
    assertEquals((Integer) 1, rank.getValue());
  }

  @DisplayName("Can retrieve a cards value")
  @Test
  public void testGetValue() {
    Rank rank = Rank.ACE;
    assertEquals((Integer) 1, rank.getValue());
  }

  @DisplayName("Can retrieve a string description of a rank")
  @Test
  public void testToString() {
    assertEquals("ace", Rank.ACE.toString());
    assertEquals("2", Rank.TWO.toString());
    assertEquals("3", Rank.THREE.toString());
    assertEquals("4", Rank.FOUR.toString());
    assertEquals("5", Rank.FIVE.toString());
    assertEquals("6", Rank.SIX.toString());
    assertEquals("7", Rank.SEVEN.toString());
    assertEquals("8", Rank.EIGHT.toString());
    assertEquals("9", Rank.NINE.toString());
    assertEquals("10", Rank.TEN.toString());
    assertEquals("jack", Rank.JACK.toString());
    assertEquals("queen", Rank.QUEEN.toString());
    assertEquals("king", Rank.KING.toString());
  }

}
