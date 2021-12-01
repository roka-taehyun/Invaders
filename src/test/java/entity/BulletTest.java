package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulletTest {

    Bullet a;

    @BeforeEach
    void setUp(){
        a = new Bullet(1,0, 10);
    }
    @Test
    @DisplayName("Bullet getSpeed Test OK")
    void getSpeedTrue(){
        assertEquals(10,a.getSpeed());
    }

    @Test
    @DisplayName("Bullet getSpeed Test X")
    void getSpeedFalse(){
        assertEquals(5,a.getSpeed());
    }

}