// Main.java
// Name : Tom Thomas
// PRN : 23070126136
// Batch : AIML B3

import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        // Creating a new deck of cards
        Deck mydeck = new Deck();

        while (true) {
            // Displaying menu options for user interaction
            System.out.println("------------------------------ MENU -------------------------------\n");
            System.out.println("1. Create Deck");
            System.out.println("2. Display Deck");
            System.out.println("3. Shuffle Deck");
            System.out.println("4. Random Card");
            System.out.println("5. Player Distribution");
            System.out.println("6. Compare Cards");
            System.out.println("7. Find Card");
            System.out.println("8. EXIT!!\n");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt(); // Fix: Changed scan.nextLine() to scan.nextInt() for integer input
            scan.nextLine(); // Consume the leftover newline

            switch (choice) {
                case 1:
                    // Creating the deck
                    System.out.println("---------------------------- Create Deck ----------------------------");
                    mydeck.createDeck();
                    break;

                case 2:
                    // Displaying the full deck
                    System.out.println("---------------------------- Display Deck ----------------------------");
                    mydeck.displayDeck();
                    break;

                case 3:
                    // Shuffling and displaying the deck
                    System.out.println("---------------------------- Shuffle Deck ----------------------------");
                    mydeck.shuffleDeck();
                    mydeck.displayDeck();
                    break;

                case 4:
                    // Picking and displaying two random cards from the deck
                    System.out.println("---------------------------- Random Card ----------------------------");
                    mydeck.randomCards();
                    break;

                case 5:
                    // Distributing 5 random cards to 3 players
                    System.out.println("---------------------------- Player Distribution ----------------------------");
                    mydeck.distributeCards();
                    break;

                case 6:
                    // Comparing two user-input cards
                    System.out.println("---------------------------- Comparing Cards ----------------------------");
                    System.out.print("Enter Rank of Card 1: ");
                    String rank1 = scan.nextLine();
                    System.out.print("Enter Suit of Card 1: ");
                    String suit1 = scan.nextLine();
                    Card card1 = new Card(rank1, suit1);

                    System.out.print("Enter Rank of Card 2: ");
                    String rank2 = scan.nextLine();
                    System.out.print("Enter Suit of Card 2: ");
                    String suit2 = scan.nextLine();
                    Card card2 = new Card(rank2, suit2);

                    // Comparing the two input cards
                    mydeck.compareCards(card1, card2);
                    mydeck.sameCard(card1, card2);
                    break;

                case 7:
                    // Searching for a specific card in the deck
                    System.out.println("---------------------------- Finding Card ----------------------------");
                    System.out.print("Enter Rank of Card: ");
                    String rank3 = scan.nextLine();
                    System.out.print("Enter Suit of Card: ");
                    String suit3 = scan.nextLine();
                    Card card3 = new Card(rank3, suit3);

                    mydeck.findCard(card3);
                    break;

                case 8:
                    // Exiting the program
                    System.out.println("Thank you for using this program!");
                    System.out.println("EXITING.....");
                    scan.close(); // Closing the scanner before exiting
                    return; // Exiting the loop and program

                default:
                    // Handling invalid inputs
                    System.out.println("Invalid Choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
