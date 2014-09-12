package tennis.game.scores;

import tennis.game.TennisScore;

public class AdvantagePlayerOne implements TennisScore {

    @Override
    public TennisScore playerOneScores() {
        return Victory.forPlayerOne();
    }

    @Override
    public TennisScore playerTwoScores() {
        return new Deuce();
    }

    @Override
    public String getDisplayString() {
        return "Advantage Player One";
    }

}
