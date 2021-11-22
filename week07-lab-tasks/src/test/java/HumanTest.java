import day01.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanTest {
    @Test
    void testGood(){
        Human human= new Human("Jhon Doe",30);
        assertEquals("Jhon Doe",human.getName());
        assertEquals(30,human.getAge());
    }

    @Test
    void testWrongAge(){
        assertThrows(IllegalArgumentException.class,
                ()->new Human("Jhon Doe",130));
    }

    @Test
    void testWrongName(){
        assertThrows(IllegalArgumentException.class,
                ()->new Human("JhonDoe",30));
    }
}
