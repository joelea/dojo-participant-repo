package tennis.game.scores;

import tennis.game.TennisScore;

public class Victory implements TennisScore {

    private final String victor;

    private Victory(String victor) {
        this.victor = victor;
    }

    @Override
    public TennisScore playerOneScores() {
        return this;
    }

    @Override
    public TennisScore playerTwoScores() {
        return this;
    }

    @Override
    public String getDisplayString() {
        return victor + " won";
    }
    
    public static Victory forPlayerOne() {
        return new Victory("Player 1");
    }

    public static Victory forPlayerTwo() {
        return new Victory("Player 2");
    }

}
