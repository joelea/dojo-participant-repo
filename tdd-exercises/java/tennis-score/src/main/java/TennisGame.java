

public class TennisGame {

    private int playerOne = 0;
    private int playerTwo = 0;

    public String score() {
        if(playerOne == 0 && playerTwo == 0) {
            return "Love all";
        }
        
        if(playerOne == 4) {
            return "Player 1 won";
        }
        
        return scoreAsString(playerOne) + "-" + scoreAsString(playerTwo);
    }

    public void playerOneScores() {
        playerOne += 1;
    }

    public void playerTwoScores() {
        playerTwo += 1;
    }

    private String scoreAsString(int score) {
        if(score == 0) {
            return "Love";
        }
        
        return "15";
    }
}
