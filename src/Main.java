import com.card.Card;
import com.deck.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();

        List<Card> drawnCards = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            drawnCards.add(deck.drawCard());
        }

        Comparator<Card> cardComparator_1 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
                .thenComparing(Card::getSuit, Comparator.naturalOrder())
                .thenComparing(Card::getRank, Comparator.naturalOrder());

        Comparator<Card> cardComparator_2 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
                .thenComparing(Card::getSuit).thenComparing(Card::getRank);

        Comparator<Card> cardComparator_3 = Comparator.comparing((Card card) -> card.getSuit().ordinal() % 2)
                .thenComparing(card -> card.getSuit().ordinal(), Comparator.naturalOrder())
                .thenComparing(card -> card.getRank().getValue());

        Comparator<Card> cardComparator_4 = Comparator.comparing((Card card) -> card.getSuit().getValue())
                .thenComparing(card -> card.getRank().getValue());

        Collections.sort(drawnCards, cardComparator_4);
        System.out.println("Cards after sort):");

        System.out.print("[ ");
        for (Card card : drawnCards) {
            System.out.print(card+",");
        }

        System.out.print(" ]");


    }
}