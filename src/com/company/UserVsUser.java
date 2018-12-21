package com.company;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by rd568 on 12/17/18.
 */
public class UserVsUser {

    //state vars will be used for the board, player one, player two
    public byte[][] theBoard;
    public String playerOne = "Player One";
    public String playerTwo = "Player Two";
    public char X = 'X';
    public char O = 'O';
    public boolean gameDone = false;
    boolean p1GoesFirst = false;
    boolean p2GoesFirst = false;

    Random r = new Random();

    //Need the board array data to be passed to all methods
    public UserVsUser(byte[][] board){
        theBoard = board;
    }

    public String whoGoesFirst(){
        int ranNum = r.nextInt(101);

        //Will decide who goes first
        // ** CHANGE LATER **
        if(ranNum <= 100){
            p1GoesFirst = true;
            return playerOne;
        }else{
            p2GoesFirst = true;
            return playerTwo;
        }
    }

    public void assignmentForPlayer(){
        System.out.println(playerOne + " is: " + X + "\n" + playerTwo + " is: " + O);
    }

    public void theGame(){
        Scanner userInput = new Scanner(System.in);
        diffOutcomes dO;
            if(p1GoesFirst){
                System.out.println("It's " + playerOne + " first turn.");
                while(gameDone != true){
                    //The turn will start at 1, if statement to alternate between turns
                    //Predetermined length
                    byte boardLen = 9;
                        for(int turn = 1; turn <= boardLen; turn++){
                            if(turn % 2 == 1){
                                System.out.println(playerOne + " please select your move");
                                System.out.println("The array is the board where [0][0/1/2]=[1,2,3] is the row, [1][0/1/2]=[1,2,3] is the column");
                                System.out.println("Select your row");
                                byte forTheRow = userInput.nextByte();
                                System.out.println("Select your column");
                                byte forTheColumn = userInput.nextByte();
                                dO = new diffOutcomes(forTheRow, forTheColumn, theBoard);
                                System.out.println("There's an " + X + " at " + theBoard[0][forTheRow] + "," + theBoard[1][forTheColumn]);
                                    if(forTheRow == theBoard[0][0] && forTheColumn == theBoard[1][0]){
                                    System.out.println("This is a test");
                                    }

                            }else{
                                System.out.println(playerTwo + " please select your move");
                                System.out.println("The array is the board where [0][0/1/2]=[1,2,3] is the row, [1][0/1/2]=[1,2,3] is the column");
                                System.out.println("Select your row");
                                byte forTheRow = userInput.nextByte();
                                System.out.println("Select your column");
                                byte forTheColumn = userInput.nextByte();
                                System.out.println("There's an " + O + " at " + theBoard[0][forTheRow] + "," + theBoard[1][forTheColumn]);

                            }
                        }
                    gameDone = true;
                }

            }
            if(p2GoesFirst){
                System.out.println("It's " + playerTwo + " first turn.");
                while(gameDone != true){
                    byte forTheGame = userInput.nextByte();


                    gameDone = true;
                }
            }
    }
}
