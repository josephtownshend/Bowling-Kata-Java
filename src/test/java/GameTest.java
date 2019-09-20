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
        int times = 20;
        int pinsDown = 0;
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
        assertThat(game.score(), is(pinsDown));
    }

    @Test
    public void canScoreGameOfOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertThat(game.score(), is(20));
    }
}
