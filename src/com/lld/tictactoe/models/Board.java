package com.lld.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public Board(int dimension) {
        for (int i = 0; i<dimension; i++) {
            this.board.add(new ArrayList<>());
            for (int j=0; j<dimension; j++) {
                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void display() {
        for (List<Cell> cells : board) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.println("|  |");
                } else {
                    System.out.println("| " + cell.getPlayer().getSymbol() + " |");
                }
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
