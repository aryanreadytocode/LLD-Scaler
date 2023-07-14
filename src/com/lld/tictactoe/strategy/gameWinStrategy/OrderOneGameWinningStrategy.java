package com.lld.tictactoe.strategy.gameWinStrategy;

import com.lld.tictactoe.models.Board;
import com.lld.tictactoe.models.Cell;
import com.lld.tictactoe.models.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private int dimension;

    public OrderOneGameWinningStrategy(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public boolean checkWinner(Board board, Player lastPlayer, Cell lastPlayerMoveCell) {
        // TODO implement this
        return false;
    }
}
