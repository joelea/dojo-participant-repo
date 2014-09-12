package tennis.game;
public interface TennisScore {
    TennisScore playerOneScores();

    TennisScore playerTwoScores();
    
    String getDisplayString();
}