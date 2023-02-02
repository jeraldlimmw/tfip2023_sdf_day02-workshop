package cards;

import java.util.LinkedList;
import java.util.List;

public class Deck {

    public String[] SUIT = {"♠", "♥", "♣", "♦"};
    public String[] NAME = {
        "A", "2", "3", "4", "5", "6", "7", "8"
        , "9", "10", "J", "Q", "K"};
    public int[] RANK = {
        1, 2, 3, 4, 5, 6, 7, 8,
         9, 10, 11, 12, 13};
    


    // private Card[] cards = new Card[52];
    private List<Card> cards = new LinkedList<>();

    public Deck() {
        for (int i = 0; i < SUIT.length; i++) {
            for (int j = 0; j < NAME.length; j++) {
                Card c = new Card(SUIT[i], NAME[j], RANK[j]);
                cards.add(c);
            }
        }
        
        for (int i = 0; i < cards.size(); i++){
            System.out.printf(">>>card %s\n", cards.get(i));
        }
        System.out.printf(">>>>>> deck count: %d", cards.size());
    }

    public Card take() {
        return cards.remove(0);
    }
}
