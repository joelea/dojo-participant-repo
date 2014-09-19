package tennis.game.scores;

import tennis.game.TennisScore;

public class SimpleTennisScore implements TennisScore {
    public int playerOne;
    public int playerTwo;

    public SimpleTennisScore(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public TennisScore playerOneScores() {
        int newPlayerOne = playerOne + 1;

        if(isDeuce(newPlayerOne, playerTwo)) {
            return new Deuce();
        }
        
        if(hasWon(newPlayerOne)) {
            return Victory.forPlayerOne();
        }

        return new SimpleTennisScore(newPlayerOne, playerTwo);
    }

    @Override
    public TennisScore playerTwoScores() {
        int newPlayerTwo = playerTwo + 1;

        if(isDeuce(playerOne, newPlayerTwo)) {
            return new Deuce();
        }
        
        if(hasWon(newPlayerTwo)) {
            return Victory.forPlayerTwo();
        }

        return new SimpleTennisScore(playerOne, newPlayerTwo);
    }
    
    @Override
    public String getDisplayString() {
        return scoreAsString(playerOne) + "-" + scoreAsString(playerTwo);
    }

    private String scoreAsString(int score) {
        switch(score) {
        case 0: return "Love";
        case 1: return "15";
        case 2: return "30";
        case 3: return "40";
        default: throw new IllegalArgumentException(String.valueOf(score) + " is not a valid score");
        }
    }

    private boolean isDeuce(int left, int right) {
        return left == 3 && right == 3;
    }

    private boolean hasWon(int points) {
        return points == 4;
    }

}