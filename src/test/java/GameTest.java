import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;



public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void canMakeGame() {
        new Game();
    }

    @Test
    public void canRollBall() {
        game.roll(0);
    }

    @Test
    public void canScoreGutterGame() {
        roll(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        roll(20, 1);
        assertThat(game.score(), is(20));
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }
}
