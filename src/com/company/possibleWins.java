package com.company;

public class possibleWins {

    public byte forTheRow;
    public byte forTheColumn;
    public byte[][] theBoard;

    public possibleWins(byte rows, byte columns, byte[][] board){
        forTheRow = rows;
        forTheColumn = columns;
        theBoard = board;
    }

    //First way to win -> top row, across
    public boolean firstWay(){
        //TEMPORARY
        return false;
    }

}
