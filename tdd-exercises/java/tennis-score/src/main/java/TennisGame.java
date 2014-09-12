

public class TennisGame {

    private int playerOne = 0;
    private int playerTwo = 0;

    public String score() {
        if(playerOne == 0 && playerTwo == 0) {
            return "Love all";
        }
        
        if(playerOne == 0) {
            return "Love-15";
        }
        
        return "15-Love";
    }

    public void playerOneScores() {
        playerOne += 1;
    }

    public void playerTwoScores() {
        playerTwo += 1;
    }

}
