package tennis.score;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import tennis.game.TennisGame;


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

    @Test public void
    when_player_one_scores_4_times_the_game_is_won_by_them() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        assertThat(game.score(), equalTo("Player 1 won"));
    }

    @Test public void
    when_player_two_scores_4_times_the_game_is_won_by_them() {
        TennisGame game = new TennisGame();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        assertThat(game.score(), equalTo("Player 2 won"));
    }

    @Test public void
    when_both_players_score_3_times_the_score_is_deuce() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        assertThat(game.score(), equalTo("Deuce"));
    }

    @Test public void
    when_there_is_deuce_and_a_player_scores_that_player_has_advantage() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        
        game.playerOneScores();

        assertThat(game.score(), equalTo("Advantage Player One"));
    }

    @Test public void
    when_player_one_has_advantage_and_scores_he_wins() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        
        game.playerOneScores();

        game.playerOneScores();

        assertThat(game.score(), equalTo("Player 1 won"));
    }
}
