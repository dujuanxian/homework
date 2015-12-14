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
        ParkingLotBoy parkingLotBoy = new JuniorParkingLotBoy(parkingLots);
        ParkingManager parkingManager = new ParkingManager(parkingLotBoy);

        Parking parking1 = parkingManager.parkCar("AAA11");
        Parking parking2 = parkingManager.parkCar("AAA22");
        
        assertThat(parking1.carId, is("AAA11"));
        assertThat(parking1.spaceNumber, is("0"));
        assertThat(parking1.parkingLotNumber, is("lot-1"));
        assertThat(parking2.carId, is("AAA22"));
        assertThat(parking2.spaceNumber, is("0"));
        assertThat(parking2.parkingLotNumber, is("lot-2"));
    }
}
