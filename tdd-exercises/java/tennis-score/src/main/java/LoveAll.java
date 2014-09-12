
public class LoveAll implements ITennisScore {

    @Override
    public TennisScore playerOneScores() {
        return new TennisScore(1, 0);
    }

    @Override
    public TennisScore playerTwoScores() {
        return new TennisScore(0, 1);
    }

    @Override
    public String getDisplayString() {
        return "Love all";
    }

}
