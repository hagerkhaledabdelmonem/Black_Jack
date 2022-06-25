package blackjack;
public class Card {
    private final int suit;
    private final int rank;
    private final int value;
    public Card(){
        suit=0;
        rank=0;
        value=0;
    }
    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    public Card(Card card_gui){
        suit=card_gui.suit;
        rank=card_gui.rank;
        value=card_gui.value;

    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    
}
