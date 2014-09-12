package tennis.game.scores;

import tennis.game.TennisScore;

public class AdvantagePlayerTwo implements TennisScore {

    @Override
    public TennisScore playerOneScores() {
        return new Deuce();
    }

    @Override
    public TennisScore playerTwoScores() {
        return Victory.forPlayerTwo();
    }

    @Override
    public String getDisplayString() {
        // TODO Auto-generated method stub
        return null;
    }

}
