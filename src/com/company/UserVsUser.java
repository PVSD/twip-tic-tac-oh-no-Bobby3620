package com.company;
import java.util.Random;

/**
 * Created by rd568 on 12/17/18.
 */
public class UserVsUser {

    //state vars will be used for the board, player one, player two
    public int[][] theBoard;
    public String playerOne = "Player One";
    public String playerTwo = "Player Two";
    public char X = 'X';
    public char O = 'O';

    Random r = new Random();

    //Need the board array data to be passed to all methods
    public UserVsUser(int[][] board){
        theBoard = board;
    }

    public String whoGoesFirst(){
        int ranNum = r.nextInt(101);

        //Will decide who goes first
        if(ranNum <= 49){
            return playerOne;
        }else{
            return playerTwo;
        }
    }

    public void assignmentForPlayer(){
        System.out.println(playerOne + " is: " + X + "\n" + playerTwo + " is: " + O);
    }

    public void theGame(){

    }
}
