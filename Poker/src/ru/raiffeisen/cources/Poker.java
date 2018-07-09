package ru.raiffeisen.cources;

import java.util.Random;
import java.util.Scanner;

public class Poker {

    public static byte numberOfPlayers;

    public static Card[] deck;
    public static Card[] deal;

    public static final String[] suit = {   "hearts",
                                            "diamonds",
                                            "clubs",
                                            "spades"
                                        };

    public static final String[] rank = {   "two",
                                            "three",
                                            "four",
                                            "five",
                                            "six",
                                            "seven",
                                            "eight",
                                            "nine",
                                            "ten",
                                            "jack",
                                            "queen",
                                            "king",
                                            "ace"
                                        };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество игроков:");
        numberOfPlayers = scanner.nextByte();

        while (numberOfPlayers > 10) {
            System.out.println("Количество игроков не может быть больше 10!\nВведите количество игроков:");
            numberOfPlayers = scanner.nextByte();
        }

        deck = createDeck();

        shuffleDeck(deck);

        deal = executeDeal(numberOfPlayers, deck);

        System.out.println();

        for (int i = 0; i < deal.length; i++) {
            System.out.println(deal[i].getCardInfo());
            if ((i + 1) % 5 == 0)
                System.out.println();
        }
    }


    public static Card[] createDeck() {
        int deckSize = suit.length * rank.length;
        Card[] deck = new Card[deckSize];
        int k = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                Card card = new Card(suit[i], rank[j]);
                deck[k] = card;
                k += 1;
            }
        }
        return deck;
    }

    public static void shuffleDeck(Card[] deck) {
        Random random = new Random();
        int randIndex;
        Card buffer;
        for (int i = 0; i < deck.length; i++) {
            randIndex = random.nextInt(deck.length - 1);
            buffer = deck[i];
            deck[i] = deck[randIndex];
            deck[randIndex] = buffer;
        }
    }


    public static Card[] executeDeal(byte numberOfPlayers, Card[] deck) {
        Card[] deal = new Card[numberOfPlayers * 5];
        int s = 0;
        int j = 0;
        for (int i = 0; i < numberOfPlayers * 5 ; i++) {
            deal[j + 5 * s] = deck[i];
            s += 1;
            if (s == numberOfPlayers) {
                s = 0;
                j += 1;
            }
        }
        return deal;
    }
}
