import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class TennisGameTest {
    @Test public void
    when_noone_has_scored_the_score_is_love_all() {
        TennisGame game = new TennisGame();
        assertThat(game.score()).isEqualTo("Love all");
    }
}
