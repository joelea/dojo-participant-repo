
public class AdvantagePlayerOne implements TennisScore {

    @Override
    public TennisScore playerOneScores() {
        return new Victory("Player 1");
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
