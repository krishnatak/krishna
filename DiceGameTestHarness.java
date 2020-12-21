
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
//import DiceGame;
public class DiceGameTestHarness {
    
    public static void main(final String[] args) {
        int diceScorePlayer1 = 0;                // to store random number for player1
        int diceScorePlayer2 = 0;               // to store random number for player2
        int scoreOfPlayer1 = 0;                 // to store total score of player 1
        int scoreOfPlayer2 = 0;                 // to store total score of player 2
        int TurnsPlayer1 = 0;                   // to count total turns of player1
        int TurnsPlayer2 = 0;                    // to count total turns of player2
        boolean gameMode = true;                // this will decide whether to run game or not
        boolean gameMode1 = true;
        int methodPrameter = 0;
        String winnerAnnouncement = "";

        Scanner inputdata1 = new Scanner(System.in);
        Random randomNumber = new Random();

        // initialising two players with no arguement
        DiceGame player1 = new DiceGame();
        DiceGame player2 = new DiceGame();
        

        //System.out.printf( );
        // instructions
        System.out.println("Welcome To Dice Game");
        System.out.println("This game is developed by Krishna Tak(CS Student,Georgian College)");
        System.out.println("");
        System.out.println("Here are some instructions for the game");
        System.out.println("1. There will be 2 players only");
        System.out.println("Each player will provide there information in the begining");
        System.out.println("Each player will play turn by turn, one after other");
        System.out.println("The Game will be closes when wrong input got detected.");
        System.out.println("Disclaimer: this is for gaming pupose, please do not use for Gambling");
        System.out.println("Thank You");
        System.out.println("");
        System.out.println("");
        
        // profile  of player 1

        System.out.println("first name of player 1");
        player1.setFirstName(inputdata1.nextLine());
        System.out.println("last name of player 1");
        player1.setLastName(inputdata1.nextLine());
        System.out.println("age of player 1");
        player1.setAge(inputdata1.nextInt());
        System.out.println("Number of vowels in your Last name :");
        int vowelsInLastName1 = inputdata1.nextInt();
        System.out.println("At the end of game, you will get your grades according to your performance, the possible grades are as follows");
        for(int i =0; i<3 ;i++)
        {
            System.out.println(i+1+" . "+WrapperClass.grades[i]);
        }
        
        System.out.println("");
        System.out.println("");

        // infor of player 2
        Scanner inputdata2 = new Scanner(System.in);

        System.out.println("first name of player 2");
        player2.setFirstName(inputdata2.nextLine());
        System.out.println("last name of player 2");
        player2.setLastName(inputdata2.nextLine());
        System.out.println("age of player 2");
        player2.setAge(inputdata2.nextInt());
        System.out.println("Number of vowels in your Last name :");
        int vowelsInLastName2 = inputdata1.nextInt();
        System.out.println("At the end of game, you will get your grades according to your performance, the possible grades are as follows");
        for(int i =0; i<3 ;i++)
        {
            System.out.println(i+1+" . "+WrapperClass.grades[i]);
        }
        System.out.println("");
        System.out.println("");



        // game starts

        do {

            int[] possibleDiceScores ={1,2,3,4,5,6};
            System.out.println("Player 1 enter 1 and player 2 enter 2");
             int inputfromplayers=0;
            try {
                 inputfromplayers = inputdata1.nextInt();
            } catch (java.util.InputMismatchException e) {
                //TODO: handle exception
                System.out.println("numbers only");
                gameMode = false;
                break;
                
            }
           
                //for player 1
                if(inputfromplayers==1)
                {   TurnsPlayer1++;
                    int randomNumberMaxFive =randomNumber.nextInt(6);
                    diceScorePlayer1 = possibleDiceScores[randomNumberMaxFive];
                    scoreOfPlayer1 = scoreOfPlayer1 + diceScorePlayer1;
                    
                    //printing  visual effects for each score of dice
                    switch (diceScorePlayer1) {
                        case 1:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+ VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+ VisualPrints.lowupupupuplow+"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 2:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowupupupupup +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upupupupupup +"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;  
                        case 3:
                            System.out.printf( VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+  VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup  +"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowlowlow+"%n");
                            break; 
                        case 4:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+ VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup  +"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup+"%n"+VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 5:
                            System.out.printf(  VisualPrints.lowlowlowlowlowlow +"%n"+ VisualPrints.upupupupupup  +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upupupupupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.upupupupupup+"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 6:
                            System.out.printf(  VisualPrints.lowlowlowlowlowlow +"%n"+ VisualPrints.upupupupupup  +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upupupupupup +"%n"+ VisualPrints.uplowlowlowlowup  +"%n"+ VisualPrints.uplowlowlowlowup  +"%n"+ VisualPrints.uplowlowlowlowup +"%n"+ VisualPrints.upupupupupup +"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;                 

                    }
                }
                //printing player 1's score
                System.out.println("Turn number :     "+TurnsPlayer1);
                System.out.println("Dice Score for Player 1 :     "+diceScorePlayer1);

                System.out.println("total Score for Player 1 :     "+scoreOfPlayer1);
                // if player score 30 then it will print congrats messsage
                if(scoreOfPlayer1>=30)
                {
                    winnerAnnouncement = player1.getFirstName().toUpperCase()+" (1)  won the game,alloted nick names that are "  +DiceGame.nickNameProvider(player1.getFirstName())+" and "+DiceGame.nickNameProvider(vowelsInLastName1)+" .  ";
                    methodPrameter = 2;
                    break;
                
                }
                
                //for player 2
                else if(inputfromplayers==2)
                {   TurnsPlayer2++;
                    int randomNumberMaxFive =randomNumber.nextInt(5);
                    diceScorePlayer2 = possibleDiceScores[randomNumberMaxFive];
                    scoreOfPlayer2 = scoreOfPlayer2 + diceScorePlayer2;

                    //printing  visual effects for each score of dice
                    switch (diceScorePlayer2) {
                        case 1:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+ VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+VisualPrints.lowlowupuplowlow+"%n"+ VisualPrints.lowupupupuplow+"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 2:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowupupupupup +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upuplowlowlowlow +"%n"+VisualPrints.upupupupupup +"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;  
                        case 3:
                            System.out.printf( VisualPrints.lowlowlowlowlowlow+"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+  VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup  +"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowlowlow+"%n");
                            break; 
                        case 4:
                            System.out.printf(VisualPrints.lowlowlowlowlowlow+"%n"+ VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup +"%n"+VisualPrints.uplowlowlowlowup  +"%n"+VisualPrints.upupupupupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup +"%n"+VisualPrints.lowlowlowlowupup+"%n"+VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 5:
                            System.out.printf(  VisualPrints.lowlowlowlowlowlow +"%n"+ VisualPrints.upupupupupup  +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upupupupupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.lowlowlowlowupup +"%n"+ VisualPrints.upupupupupup+"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;
                        case 6:
                            System.out.printf(  VisualPrints.lowlowlowlowlowlow +"%n"+ VisualPrints.upupupupupup  +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upuplowlowlowlow +"%n"+ VisualPrints.upupupupupup +"%n"+ VisualPrints.uplowlowlowlowup  +"%n"+ VisualPrints.uplowlowlowlowup  +"%n"+ VisualPrints.uplowlowlowlowup +"%n"+ VisualPrints.upupupupupup +"%n"+  VisualPrints.lowlowlowlowlowlow+"%n");
                            break;                 

                    }
                }
                // in case input is not 1 or 2 for player numbers
                else if(inputfromplayers!=1 && inputfromplayers!=2 )
                {
                    System.out.println("Invalid Input: select 1 or 2");
                    gameMode = false;
                    break;
                }
                //printing player 2's score
                System.out.println("Turn number :     "+TurnsPlayer2);
                System.out.println("Dice Score for Player 2:     "+diceScorePlayer2);

                System.out.println("total Score for Player 2 :     "+scoreOfPlayer2);
                // if player score 30 then it will print congrats messsage
                if(scoreOfPlayer2>=30)
                {
                    winnerAnnouncement = player2.getFirstName().toUpperCase()+" (2)  won the game and This player got Two nick names that are "  +DiceGame.nickNameProvider(player2.getFirstName())+" and "+DiceGame.nickNameProvider(vowelsInLastName2)+" .  ";
                    methodPrameter = 2;
                    break;
                }
              

        
        }while(gameMode);
        //closing the scanner objects
        inputdata1.close();
        inputdata2.close();
        //announcement of winner
        if(gameMode)
        {
            System.out.println(winnerAnnouncement.trim());
            System.out.println(WrapperClass.overallPerformance(methodPrameter));
        }
        else{
            System.out.println("Alert!!!!Game crashed, please restart again");
        }
        int repetition =1;
        while(repetition<4)
        {
            System.out.println("Thank you for playing this wonderfull Dice Game, we are working to upgrade it continuously");
            repetition++;
        }
        

        

    }
}