
public class Deuce implements TennisScore  {

    @Override
    public TennisScore playerOneScores() {
        return new AdvantagePlayerOne();
    }

    @Override
    public TennisScore playerTwoScores() {
        return new AdvantagePlayerTwo();
    }

    @Override
    public String getDisplayString() {
        return "Deuce";
    }

}
