package cards;

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
}