package com.comparator;

import com.card.Card;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int colorComparison = Integer.compare(card1.getSuit().ordinal() % 2, card2.getSuit().ordinal() % 2);
        if (colorComparison != 0) {
            return colorComparison;
        }
        int suitComparison = Integer.compare(card1.getSuit().ordinal() % 2, card2.getSuit().ordinal() % 2);

        if (suitComparison != 0) {
            return suitComparison;
        }
        return Integer.compare(card1.getRank().getValue(), card2.getRank().getValue());
    }
}
