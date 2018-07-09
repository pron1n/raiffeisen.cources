package ru.raiffeisen.cources;


public class Card {
    protected String suit;
    protected String rank;


    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getCardInfo() {
        return rank + " of " + suit;
    }
}
