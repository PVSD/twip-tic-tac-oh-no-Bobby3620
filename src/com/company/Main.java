package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Game will restart automatically
        boolean gameDone = false;
        //while(gameDone != true){
            //The user will choose the game mode
            System.out.println("Welcome user! You're going to play a game of tic tac toe.");
            System.out.println("You have three options. Choose 1 for user vs user. Choose 2 for user vs computer. Choose 3 for computer vs computer(1, 2, 3).");

            //Scanner for the user to choose
            Scanner kbInput = new Scanner(System.in);
            byte option = kbInput.nextByte();

            //The array is the board where [0][1] is the row, [1][0] is the column
            //Start with zero for selecting the row, then one for selecting the column
            //For example [0][2] + [1][1] would be row 3, column 2
            //All of this is expressed in index, but outputted as normal
            byte[][] board = new byte[][] { {0, 1, 2}, {0, 1, 2} };

            //Objects for each option
            UserVsUser UvU = new UserVsUser(board);

            //If 1 is selected
            if(option == 1){
                System.out.println("You selected user vs user");
                UvU.assignmentForPlayer();
                System.out.println("The person that goes first is: " + UvU.whoGoesFirst());
                UvU.theGame();
            }

            //If 2 is selected
            if(option == 2){
                System.out.println("You have selected user vs computer");

            }

            //If 3 is selected
            if(option == 3){
                System.out.println("You have selected computer vs computer");

            }

            //ADD LATER
            /*Where the user selects whether they want to play again
            System.out.println("Would you like to play again?(y/n)");
            String selection = kbInput.nextLine().toLowerCase();
                if(selection.equalsIgnoreCase("y")){
                    System.out.println("Okay! Let's play again");
                }else{
                    gameDone = true;
                }
             */
        //}
    }
}
