package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    
    private String[] SUIT = {"♠", "♥", "♣", "♦"};
    private String[] NAME = {
        "A", "2", "3", "4", "5", "6", "7", "8"
        , "9", "10", "J", "Q", "K"};
    private int[] RANK = {
        1, 2, 3, 4, 5, 6, 7, 8
        , 9, 10, 11, 12, 13};
    
    private List<Card> cardDeck = new ArrayList<>();
    private int deckSize = 0;

    public Deck() {
        for (int i = 0; i < SUIT.length; i++) {
            for (int j = 0; j < NAME.length; j++) {
                Card c = new Card(SUIT[i], NAME[j], RANK[j]);
                cardDeck.add(c);
            }
        }
        deckSize = cardDeck.size();
        // To view cards in initial deck:
        // viewDeck();
        shuffle();   
    }

    public int getDeckSize() {
        return deckSize;
    }

    public Card take() {
        deckSize--;
        return cardDeck.remove(0);
    }

    public void shuffle() { 
        for (int i = 0; i < deckSize; i++) {
            swap(i);
        }
        // To view cards after shuffling:
        // viewDeck();
    }

    public void swap(int i) {
        Random rand = new Random();
        int r = rand.nextInt(deckSize);
        if (i == r) {
            swap(i); // recursion - call swap again if i and r are the same number
        } else {
            Collections.swap(cardDeck, i, r); // exchange card positions in list
        }
    }

    // Additional method to check the deck:
    // public void viewDeck() {
    //     for (int i = 0; i < deckSize; i++) {
    //         System.out.printf(">>> %s\n", cardDeck.get(i));
    //     }
    // }

    @Override
    public String toString() {
        return cardDeck.toString();
    }
}
