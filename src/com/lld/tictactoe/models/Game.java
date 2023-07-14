package com.lld.tictactoe.models;

import com.lld.tictactoe.strategy.gameWinStrategy.GameWinningStrategy;
import com.lld.tictactoe.strategy.gameWinStrategy.OrderOneGameWinningStrategy;
import exceptions.InvalidGameConstructionParameterException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Move> moves;
    private List<Player> players;
    private GameStatus gameStatus;
    private Player winner;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;

    private Game() {

    }

    public static Builder getBuilder() {
        return new Builder();
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameConstructionParameterException {
            if (this.dimension <3)
                throw  new InvalidGameConstructionParameterException("Dimension of game can't be 1");
            if (this.players.size() != this.dimension-1)
                throw new  InvalidGameConstructionParameterException("Number of dimension must be N-1");
            return true;
        }

        public Game build() throws InvalidGameConstructionParameterException {
            try {
                valid();
            } catch (Exception e) {
                throw new InvalidGameConstructionParameterException(e.getMessage());
            }

            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));
            return game;
        }
    }


}
