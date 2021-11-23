package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    List<Movie> movies = new ArrayList<>();

    public MovieService(Path path){
        try{
            List<String> tmp= Files.readAllLines(path);
            for (String s :
                    tmp) {
                movies.add(new Movie(s));
            }
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
