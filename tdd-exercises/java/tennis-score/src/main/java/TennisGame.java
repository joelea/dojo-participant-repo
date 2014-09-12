

public class TennisGame {

    private int playerOne = 0;

    public String score() {
        if(playerOne == 0) {
            return "Love all";
        }
        
        return "15-Love";
    }

    public void playerOneScores() {
        playerOne += 1;
    }

}
