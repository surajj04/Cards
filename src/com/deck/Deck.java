package com.deck;

import com.card.Card;
import com.enums.Rank;
import com.enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {// 4
            for (Rank rank : Rank.values()) {// 13
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new NoSuchElementException("com.card.Deck is empty");
        }
        return cards.remove(0);
    }

    public int size() {
        return cards.size();
    }
}
