package cards;

// import java.util.random.*;
// import java.util.Arrays;

public class Card {
    // members
    private String suit;
    private String name;
    private int rank;

    // constructor
    public Card(String suit, String name, int rank) {
        this.suit = suit;
        this.name = name;
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return "Card{suit=%s, name = %s, rank = %d}".formatted(this.suit, this.name, this.rank);
    }

    /*
    // methods
    public void shuffle(){
        Random rand = new Random();
        for (int i = 0; i < deckCount; i++) {
            swap(i);
        }
    }

    public void swap(int i){
        int x = rand.nextInt(deckCount);
        if (!i==x) {
            String temp = deck[x];
            deck[i] = deck[x];
            deck[x] = deck[i];
        } else {
            swap(i);
        }
    }

    public void take() {
        String temp[] = new String[deckCount - 1];
        System.out.printf("drew %s\n", deck[deckCount - 1]);
        for (int i = 0; i < deckCount-1; i++) {
            temp[i] = deck[i];
        }
        deck = temp;
    }

    public void take(int n) {
        for (int i = 0; i < n; i++) {
            take();
        }
    }
    */
}