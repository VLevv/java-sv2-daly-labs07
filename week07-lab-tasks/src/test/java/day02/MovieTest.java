package day02;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieTest {
    @Test
    void testMovie(){
        MovieService service = new MovieService(Paths.get("src/main/resources/movies.csv"));
        assertEquals("Titanic;1997;James Cameron",service.getMovies().get(1).getInfo());
    }

    @Test
    void testThrow(){
        IllegalStateException ise=assertThrows(IllegalStateException.class,
                ()->new MovieService(Paths.get("")));
        assertEquals("Can not read file",ise.getMessage());
    }
}
