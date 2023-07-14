package com.lld.tictactoe.models;

import com.lld.tictactoe.strategy.BotPlayingStrategy;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy playingStrategy;

    public Bot(String name, char symbol, BotDifficultyLevel botDifficultyLevel,
               BotPlayingStrategy playingStrategy) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.playingStrategy = playingStrategy;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getPlayingStrategy() {
        return playingStrategy;
    }

    public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }

    public Move decideMove() {
        return playingStrategy.decideMove(this);
    }
}
