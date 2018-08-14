package com.techma.deck;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Represents a card's suite hearts, spades, etc")
public class SuitTest {

    @DisplayName("Should be able to construct a suit")
    @Test
    public void testConstruct() {
        Suit suit = Suit.HEARTS;
        assertEquals("hearts", suit.getValue());
    }
}
