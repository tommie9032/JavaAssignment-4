# Card Game Application

This repository contains a card game application implemented in Java, which simulates a deck of cards and provides various functionalities such as creating a deck, shuffling, displaying, distributing cards, and comparing cards. The application is implemented using three main classes: `Main`, `Deck`, and `Card`.

## Table of Contents
1. [Overview](#overview)
2. [Classes](#classes)
    - [Main](#main)
    - [Deck](#deck)
    - [Card](#card)
3. [Features](#features)
4. [Usage](#usage)
5. [License](#license)

## Overview
This is a simple card game application where you can interact with a deck of cards using a terminal interface. The program offers several functionalities such as creating a deck of cards, displaying it, shuffling the deck, distributing cards to players, and comparing two cards.

## Classes

### Main
The `Main` class is the entry point of the application. It provides a menu-driven interface to interact with the deck of cards. It allows users to:
- Create a deck
- Display the deck
- Shuffle the deck
- Pick random cards
- Distribute cards to players
- Compare two cards
- Find a specific card
- Exit the application

#### Key Methods:
- `main(String[] args)`: The main method that provides a user-friendly menu for interacting with the deck.

### Deck
The `Deck` class manages the collection of playing cards. It handles creating a deck, shuffling, displaying, and distributing cards to players. It also allows you to compare two cards or search for a specific card in the deck.

#### Key Methods:
- `createDeck()`: Creates a standard deck of 52 playing cards (13 ranks, 4 suits).
- `displayDeck()`: Displays all cards in the deck.
- `shuffleDeck()`: Shuffles the deck randomly.
- `randomCards()`: Displays two random cards from the deck.
- `distributeCards()`: Distributes 5 random cards to 3 players.
- `compareCards(Card card1, Card card2)`: Compares two cards based on rank and suit.
- `sameCard(Card card1, Card card2)`: Checks if two cards have the same suit.
- `findCard(Card card1)`: Searches for a specific card in the deck.

### Card
The `Card` class represents a single playing card with a rank (e.g., 2-10, J, Q, K, A) and a suit (e.g., Diamonds, Hearts, Spades, Clubs). Each card is created using a specific rank and suit.

#### Key Methods:
- `Card(String rank, String suit)`: Constructor that initializes the card with a given rank and suit.
- `toString()`: Returns a string representation of the card (e.g., "Ace of Spades").

## Features
- **Deck Creation**: Create a standard deck of 52 cards.
- **Deck Display**: Display the full deck of cards.
- **Deck Shuffling**: Shuffle the deck of cards randomly.
- **Random Card Selection**: Pick two random cards from the deck.
- **Card Distribution**: Distribute 5 cards each to 3 players in a round-robin fashion.
- **Card Comparison**: Compare two cards to check if they have the same rank, same suit, or are completely different.
- **Card Search**: Find if a specific card exists in the deck.

## Usage

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/card-game.git
    ```
   
2. Navigate to the project directory:
    ```bash
    cd card-game
    ```

3. Compile the Java files:
    ```bash
    javac Main.java Deck.java Card.java
    ```

4. Run the application:
    ```bash
    java Main
    ```

5. Interact with the application through the menu:
    - Choose an option from the menu to create, shuffle, display, or compare cards.
    - Enter card details (rank and suit) for comparison or searching.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
