package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourierTest {
    @Test
    void testCourier(){
        Courier courier = new CourierFileManager().createCourierByFile(Paths.get("src/main/resources/courier.txt"));
        assertEquals(10,courier.getRides().get(2).getKm());
    }
}
