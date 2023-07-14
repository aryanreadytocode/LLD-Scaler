package com.lld.tictactoe.strategy;

import com.lld.tictactoe.models.Move;
import com.lld.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player);
}
