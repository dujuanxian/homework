import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParkingManagerTest {
    @Test
    public void shouldParkingManagerParkCarByParkingLotBoy() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(
                new ParkingLot(1, "lot-1"),
                new ParkingLot(5, "lot-2")));

        ParkingManager parkingManager = new ParkingManager(
                new JuniorParkingBoy(parkingLots));
        Parking parking1 = parkingManager.parkCar("AAA11");
        Parking parking2 = parkingManager.parkCar("AAA22");
        
        assertThat(parking1, is(new Parking("AAA11", "0", "lot-1")));
        assertThat(parking2, is(new Parking("AAA22", "0", "lot-2")));
    }
}
