import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParkingLotManagerTest {
    @Test
    public void shouldManagerPark2Cars() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(new ParkingLot(10)));
        ParkingLotManager manager = new ParkingLotManager(parkingLots);
        Parking parking1 = manager.parkCar("AAA11");
        Parking parking2 = manager.parkCar("AAA22");
        assertThat(parking1.carId, is("AAA11"));
        assertThat(parking1.spaceNumber, is("0"));
        assertThat(parking2.carId, is("AAA22"));
        assertThat(parking2.spaceNumber, is("1"));
    }
}
