
public class SimpleTennisScore implements TennisScore {
    public int playerOne;
    public int playerTwo;

    public SimpleTennisScore(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public SimpleTennisScore playerOneScores() {
        return new SimpleTennisScore(playerOne + 1, playerTwo);
    }

    @Override
    public SimpleTennisScore playerTwoScores() {
        return new SimpleTennisScore(playerOne, playerTwo + 1);
    }
    
    @Override
    public String getDisplayString() {
        if(playerOne == 3 && playerTwo == 3) {
            return "Deuce";
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