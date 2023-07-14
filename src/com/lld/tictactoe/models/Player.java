package com.lld.tictactoe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(String name, char symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decideMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell the row");
        int row = scanner.nextInt();
        System.out.println("Please tell the column");
        int col = scanner.nextInt();

        return new Move(this, new Cell(row, col));
    }
    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
