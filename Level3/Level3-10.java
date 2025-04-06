//10
/*Write a program to create a deck of cards, initialize the deck, shuffle the deck,
and distribute the deck of n cards to x number of players. Finally, print the cards the
players have.
 */

import java.util.Random;
import java.util.Scanner;

class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > numOfCards) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }
        String[][] players = new String[x][n];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int n = scanner.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, n, x);
        
        if (players != null) {
            printPlayers(players);
        }
        scanner.close();
    }
}
