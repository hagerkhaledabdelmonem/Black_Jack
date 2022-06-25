package blackjack;
import java.util.Random;
import java.util.Scanner;
public class Game {
      Player players[]=new Player[4];
      Card cards[]=new Card[52];
     int value_highscore;
    public void generates_card()
    {
        int index=0;
       for(int suitvalue=0;suitvalue<4;suitvalue++){
           for (int i = 0; i < 13; i++) {
               if(i<=8) {
                   cards[index]=new Card(suitvalue,i,i+1);
               } 
               else {
                   cards[index]=new Card(suitvalue,i,10);
               }

               index++;
           }
       }
     
    }
    
    public  Card draw_card()
    {
        Card newcard=new Card();
        Random rand=new Random();
        while (true) {            
          int randomchoice=rand.nextInt(52);
          if(cards[randomchoice]!=null){
          newcard=cards[randomchoice];     
          cards[randomchoice]=null;        
          return newcard ;               
          }
        }
    } 
    
     public  void player_infomation_cards() {
         Scanner read=new Scanner(System.in);
        for(int i=0;i<3;i++){
                players[i]=new Player();
                System.out.println("Enter the name of player "+(i+1));
                players[i].setName(read.next());
                for(int j=0;j<2;j++){
                    players[i].card_adding(draw_card());
                }
        }
        players[3]=new Player();
        players[3].setName("dealer");
        for(int j=0;j<2;j++){
                    players[3].card_adding(draw_card());
                }
     }
    
     public void update_game_maximumscore(){
         int max_val=-1000;
         for (int i = 0; i < 3; i++) {
             if(players[i].getScore()<=21 && players[i].getScore() >value_highscore ){
                 value_highscore=players[i].getScore();
               
             }
             
             
         }
     }

                 
             
        
      
}
         
     
    

