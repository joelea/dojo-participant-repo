
public class Victory implements TennisScore {

    private final String victor;

    public Victory(String victor) {
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

}
