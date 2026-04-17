package printempsbowlingSupermercat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GameTest {

    @Test
    void firstTest() {
        Game game = new Game();
        assertEquals("1", game.next());
    }
    
    @Test
    void secondTest() {
        Game game = new Game();
        game.next();
        assertEquals("2", game.next());
    }
}

