public interface TennisScore {
    SimpleTennisScore playerOneScores();

    SimpleTennisScore playerTwoScores();
    
    String getDisplayString();
}