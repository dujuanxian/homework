import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JuniorParkingBoyTest {
    @Test
    public void shouldManagerPark2Cars() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(
                new ParkingLot(10, "lot-1")));
        
        ParkingBoy parkingBoy = new JuniorParkingBoy(parkingLots);
        Parking parking1 = parkingBoy.parkCar("AAA11");
        Parking parking2 = parkingBoy.parkCar("AAA22");

        assertThat(parking1, is(new Parking("AAA11", "0", "lot-1")));
        assertThat(parking2, is(new Parking("AAA22", "1", "lot-1")));
    }

    @Test
    public void shouldManagerPark2CarsInAnotherParkingLotWhenFirstIsFull() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(
                new ParkingLot(1, "lot-1"), 
                new ParkingLot(10, "lot-2")));
        
        ParkingBoy parkingBoy = new JuniorParkingBoy(parkingLots);
        Parking parking1 = parkingBoy.parkCar("AAA11");
        Parking parking2 = parkingBoy.parkCar("AAA22");

        assertThat(parking1, is(new Parking("AAA11", "0", "lot-1")));
        assertThat(parking2, is(new Parking("AAA22", "0", "lot-2")));
    }
}
