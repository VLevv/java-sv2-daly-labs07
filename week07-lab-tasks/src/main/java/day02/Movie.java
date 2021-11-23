package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Movie {
    private String info;

    public Movie(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
