public interface TennisScore {
    TennisScore playerOneScores();

    TennisScore playerTwoScores();
    
    String getDisplayString();
}