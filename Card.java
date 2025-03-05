/*
 * Card.java
 * This class represents a playing card with a rank and a suit.
 * Each card is defined by its rank (e.g., "A", "10", "K") and its suit (e.g., "Hearts", "Spades").
 */

class Card {
    String rank; // Stores the rank of the card
    String suit; // Stores the suit of the card

    /*
     * Constructor for the Card class.
     * Initializes the card with a given rank and suit.
     */
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /*
     * Returns a string representation of the card.
     * Example output: "Ace of Spades" or "10 of Hearts".
     */
    public String toString() {
        return rank + " of " + suit;
    }
}
