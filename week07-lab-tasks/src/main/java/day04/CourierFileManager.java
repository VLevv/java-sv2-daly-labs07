package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {

        try {
            return createCourier(Files.readAllLines(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private Courier createCourier(List<String> lines) {
        Courier courier = new Courier();
        for (String item : lines) {
            String[] parts = item.split(" ");
            courier.addRide(new Ride(
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2])
            ));
        }
        return courier;
    }
}
