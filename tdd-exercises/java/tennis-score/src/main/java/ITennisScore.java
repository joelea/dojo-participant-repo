public interface ITennisScore {
    TennisScore playerOneScores();

    TennisScore playerTwoScores();
    
    String getDisplayString();
}