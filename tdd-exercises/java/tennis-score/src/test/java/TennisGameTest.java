import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;


public class TennisGameTest {
    @Test public void
    when_noone_has_scored_the_score_is_love_all() {
        TennisGame game = new TennisGame();
        assertThat(game.score(), equalTo("Love all"));
    }

    @Test public void
    when_player_one_scores_once_the_score_should_be_15_love() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        assertThat(game.score(), equalTo("15-Love"));
    }
    
    @Test public void
    when_player_two_scores_once_the_score_should_be_love_15() {
        TennisGame game = new TennisGame();
        game.playerTwoScores();
        assertThat(game.score(), equalTo("Love-15"));
    }
    
    @Test public void
    when_players_one_and_two_both_score_once_the_score_is_15_all() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerTwoScores();
        assertThat(game.score(), equalTo("15-15"));
    }
}
