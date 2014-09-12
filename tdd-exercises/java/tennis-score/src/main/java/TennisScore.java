
public class TennisScore implements ITennisScore {
    public int playerOne;
    public int playerTwo;

    public TennisScore(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public TennisScore playerOneScores() {
        return new TennisScore(playerOne + 1, playerTwo);
    }

    public TennisScore playerTwoScores() {
        return new TennisScore(playerOne, playerTwo + 1);
    }
    
    public String getDisplayString() {
        if(playerOne == 0 && playerTwo == 0) {
            return "Love all";
        }
        
        if(playerOne == 4) {
            return "Player 1 won";
        }
        
        return scoreAsString(playerOne) + "-" + scoreAsString(playerTwo);
    }

    private String scoreAsString(int score) {
        if(score == 0) {
            return "Love";
        }
        
        return "15";
    }
}