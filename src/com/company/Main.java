package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The user will choose the game mode
        System.out.println("Welcome user! You're going to play a game of tic tac toe.");
        System.out.println("You have three options. Choose 1 for user vs user. Choose 2 for user vs computer. Choose 3 for computer vs computer(1, 2, 3).");

        //Scanner for the user to choose
        Scanner kbInput = new Scanner(System.in);
        int option = kbInput.nextInt();

        //If 1 is selected
        if(option == 1){
            System.out.println("You selected user vs user");


        }

        //If 2 is selected
        if(option == 2){
            System.out.println("You have selected user vs computer");

        }

        //If 3 is selected
        if(option == 3){
            System.out.println("You have selected computer vs computer");

        }



    }
}
