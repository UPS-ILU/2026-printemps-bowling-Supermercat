package printempsbowlingSupermercat;

import static org.junit.jupiter.api.Assertions.*;


public class GameTest {

    @Test
    void firstTest() {
        Game game = new Game();
        assertEquals("1", game.next());
    }
}

