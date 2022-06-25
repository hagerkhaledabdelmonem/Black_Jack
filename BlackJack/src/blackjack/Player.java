package blackjack;
public class Player {
    private  String name;
    private int score=0;
    private Card arrofcard[]=new Card[11];
    private int card_player_index=0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Card[] getArrofcard() {
        return arrofcard;
    }

    public int getScore() {
        return score;
    }

    public void card_adding(Card add_card){
        if(card_player_index<11){
            arrofcard[card_player_index]=add_card;
            score+=add_card.getValue();
            card_player_index++;
        }
    }

    

    
   

   
   
}
