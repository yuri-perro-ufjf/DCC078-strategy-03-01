import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldBeCallRunActionPlayer(){
        Player player = new Player("big_player");
        player.run();
        assertEquals("Player: big_player now is running!", player.getLastAction());
    }

    @Test
    void shouldBeCallJumpActionPlayer(){
        Player player = new Player("master_player");
        player.jump();
        assertEquals("Player: master_player jumped!", player.getLastAction());
    }

    @Test
    void shouldBeCallSleepActionPlayer(){
        Player player = new Player("master_player");
        player.sleep();
        assertEquals("Player: master_player now is sleeping!", player.getLastAction());
    }
}