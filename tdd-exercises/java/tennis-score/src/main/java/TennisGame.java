

public class TennisGame {

    private TennisScore score = new LoveAll();

    public String score() {
        return score.getDisplayString();
    }

    public void playerOneScores() {
        score = score.playerOneScores();
    }

    public void playerTwoScores() {
        score = score.playerTwoScores();
    }
}
