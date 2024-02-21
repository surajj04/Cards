package com.enums;

public enum Suit {

    HEARTS(1), SPADES(2), DIAMONDS(3), CLUB(4);

    private int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}