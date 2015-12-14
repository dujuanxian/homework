import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LeadParkingBoyTest {
    @Test
    public void shouldChooseHighestVacancyRateParkingLot() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(
                new ParkingLot(4, "lot-1"), 
                new ParkingLot(5, "lot-2")));

        ParkingBoy parkingBoy = new LeadParkingBoy(parkingLots);
        Parking parking1 = parkingBoy.parkCar("AAA11");
        Parking parking2 = parkingBoy.parkCar("AAA22");
        Parking parking3 = parkingBoy.parkCar("AAA33");
        Parking parking4 = parkingBoy.parkCar("AAA44");

        assertThat(parking1, is(new Parking("AAA11", "0", "lot-1")));
        assertThat(parking2, is(new Parking("AAA22", "0", "lot-2")));
        assertThat(parking3, is(new Parking("AAA33", "1", "lot-2")));
        assertThat(parking4, is(new Parking("AAA44", "1", "lot-1")));
    }
}
