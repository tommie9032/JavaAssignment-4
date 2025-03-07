// Deck.java
// This class represents a deck of playing cards and provides various functionalities 
// like creating, shuffling, displaying, distributing, and comparing cards.

import java.util.*;

class Deck {
    ArrayList<Card> deck; // List to store the deck of cards

    // Constructor initializes an empty deck
    public Deck() {
        deck = new ArrayList<>();
    }

    /*
     * Creates a standard deck of 52 playing cards.
     * Each card has a rank (2-10, J, Q, K, A) and a suit (Diamonds, Hearts, Spades, Clubs).
     */
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "A", "J"};
        String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Displays all cards in the deck
    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Shuffles the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    /*
     * Picks and displays two random cards from the deck.
     * Assumes the deck is not empty.
     */
    public void randomCards() {
        Card card1 = deck.get(0);
        Card card2 = deck.get(1);
        System.out.println(card1);
        System.out.println(card2);
    }

    /*
     * Distributes 5 random cards each to 3 players from the deck.
     * The cards are assigned in a round-robin fashion.
     */
    public void distributeCards() {
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();

        int count1 = 0, count2 = 0, count3 = 0;

        for (int i = 0; count1 < 5; i += 3) {
            player1.add(deck.get(i));
            count1++;
        }

        for (int x = 1; count2 < 5; x += 3) {
            player2.add(deck.get(x));
            count2++;
        }

        for (int q = 2; count3 < 5; q += 3) {
            player3.add(deck.get(q));
            count3++;
        }

        System.out.println("First Player Cards:");
        for (Card card : player1) {
            System.out.println(card);
        }

        System.out.println("Second Player Cards:");
        for (Card card : player2) {
            System.out.println(card);
        }

        System.out.println("Third Player Cards:");
        for (Card card : player3) {
            System.out.println(card);
        }
    }

    /*
     * Compares two cards based on their rank and suit.
     * Prints whether they have the same rank, same suit, or are completely different.
     */
    public void compareCards(Card card1, Card card2) {
        if (card1.rank.equals(card2.rank)) {
            System.out.println("The Cards have the same Rank!!\n");
        } else if (card1.suit.equals(card2.suit)) {
            System.out.println("The cards have the same Suit!!\n");
        } else {
            System.out.println("The Cards do not have the same Number or Rank!!\n");
        }
    }

    /*
     * Checks if two cards belong to the same suit.
     * Prints an appropriate message.
     */
    public void sameCard(Card card1, Card card2) {
        if (card1.suit.equals(card2.suit)) {
            System.out.println("The cards are from the same SUIT!!");
            return;
        }
        System.out.println("The Cards are from Different Suit");
    }

    /*
     * Searches for a specific card in the deck.
     * Prints whether the card is found or not.
     */
    public void findCard(Card card1) {
        for (Card card : deck) {
            if (card.rank.equals(card1.rank) && card.suit.equals(card1.suit)) {
                System.out.println("Card " + card1 + " exists in Deck!!");
                return;
            }
        }
        System.out.println("Card is not present in Deck");
    }
}
