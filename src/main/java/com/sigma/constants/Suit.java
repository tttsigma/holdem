package com.sigma.constants;

public enum Suit {
    DIAMOND("♦"),
    CLUB("♣"),
    HEART("♥"),
    SPADE("♠");

    private final String cardSuit;

    Suit(String suit) {
        this.cardSuit = suit;
    }

    public String getCardSuit() {
        return this.cardSuit;
    }
}
