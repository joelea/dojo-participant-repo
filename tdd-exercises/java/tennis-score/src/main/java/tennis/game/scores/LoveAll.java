package tennis.game.scores;

import tennis.game.TennisScore;

public class LoveAll implements TennisScore {

    @Override
    public SimpleTennisScore playerOneScores() {
        return new SimpleTennisScore(1, 0);
    }

    @Override
    public SimpleTennisScore playerTwoScores() {
        return new SimpleTennisScore(0, 1);
    }

    @Override
    public String getDisplayString() {
        return "Love all";
    }

}
