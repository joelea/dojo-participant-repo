

public class TennisGame {

    private TennisScore score = new TennisScore(0, 0);

    public String score() {
        if(score.playerOne == 0 && score.playerTwo == 0) {
            return "Love all";
        }
        
        if(score.playerOne == 4) {
            return "Player 1 won";
        }
        
        return scoreAsString(score.playerOne) + "-" + scoreAsString(score.playerTwo);
    }

    public void playerOneScores() {
        score = score.playerOneScores();
    }

    public void playerTwoScores() {
        score = score.playerTwoScores();
    }

    private String scoreAsString(int score) {
        if(score == 0) {
            return "Love";
        }
        
        return "15";
    }
}
