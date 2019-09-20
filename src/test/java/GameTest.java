import org.junit.Test;
import org.junit.Assert;

public class GameTest {

    @Test
    public void canMakeGame() {
        new Game();
    }

    @Test
    public void canRollBall() {
        Game game = new Game();
        game.roll(0);
    }
}
