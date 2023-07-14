package com.lld.tictactoe.strategy.gameWinStrategy;

import com.lld.tictactoe.models.Board;
import com.lld.tictactoe.models.Cell;
import com.lld.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastPlayer, Cell lastPlayerMoveCell);
}
