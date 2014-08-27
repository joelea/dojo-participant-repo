import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;


public class GameTest {
    @Test public void
    should_score_0_if_no_pins_are_knocked_over() {
        Game game = new Game();
        for(int i = 0; i < 20; i++) {
            game.score(0);
        }
        
        assertThat(game.getScore(), equalTo(20));
    }
}
