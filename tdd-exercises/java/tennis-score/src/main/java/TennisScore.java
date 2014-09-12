
public class TennisScore {
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
}