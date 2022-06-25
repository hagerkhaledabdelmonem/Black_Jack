package blackjack;
import java.util.Scanner;
public class BlackJack {
    static Game game=new Game();
    static int choice;
     public static void main(String[] args) {
      GUI gui=new GUI();
      game.generates_card();
      game.player_infomation_cards();
      gui.runGUI(game.cards, game.players[0].getArrofcard(), game.players[1].getArrofcard(), game.players[2].getArrofcard(), game.players[3].getArrofcard());
         players(gui);
         dealer(gui);
         winner();
         
         }
    
     public static void players(GUI gui) {
             Scanner input=new Scanner(System.in);
            for (int i = 0; i <3; i++) {

                   while ((game.players[i].getScore()<21)) {  
                           System.out.println((i+1)+"] turn's");
                           System.out.println("Enter your choice:");
                           System.out.println("1)Hit \n2)Stand");
                           choice=input.nextInt();
                           if(choice==1){
                               Card drawed_card=game.draw_card();
                                  game.players[i].card_adding(drawed_card);
                                  gui.updatePlayerHand(drawed_card, i);
                                  game.update_game_maximumscore();
                           }
                           else{
                                   break;
                           }
                        } 
                }
            }
     
     public static void dealer(GUI gui) {
          while((game.players[3].getScore()<21)&&(game.players[3].getScore()<game.value_highscore)){
              Card drawed_card=game.draw_card();
              game.players[3].card_adding(drawed_card);
              gui.updateDealerHand(drawed_card, game.cards);
              game.update_game_maximumscore();
          } 

      }
      
     public static void winner(){
          int counter=0;
          int index_of_winner_player=-1;
          for(int i=0;i<4;i++){
              if((game.players[i].getScore()==game.value_highscore)){
                  counter++;
                  index_of_winner_player=i;
              }
          }
            if(counter>1){
            System.out.println("It's a PUSH");
            }
            else if((counter==1)&&(game.players[index_of_winner_player].getScore()<=21)){
            System.out.println("The WINNER is "+game.players[index_of_winner_player].getName());

        }
             else if(counter!=1){
                  
                  System.out.println("It's a PUSH");
                 }
              }
             
          }
        
     
   

    
     

    
     

