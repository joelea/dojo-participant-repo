
public class AdvantagePlayerTwo implements TennisScore {

    @Override
    public TennisScore playerOneScores() {
        return new Deuce();
    }

    @Override
    public TennisScore playerTwoScores() {
        return new Victory("Player 2");
    }

    @Override
    public String getDisplayString() {
        // TODO Auto-generated method stub
        return null;
    }

}
