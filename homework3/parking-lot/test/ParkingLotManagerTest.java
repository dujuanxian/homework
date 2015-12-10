import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParkingLotManagerTest {
    @Test
    public void shouldManagerPark3Cars() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(new ParkingLot(10)));
        ParkingLotManager manager = new ParkingLotManager(parkingLots);
        String voucher1 = manager.parkCar("AAA11");
        String voucher2 = manager.parkCar("AAA22");
        String voucher3 = manager.parkCar("AAA33");
        assertThat(voucher1, is("0-AAA11"));
        assertThat(voucher2, is("1-AAA22"));
        assertThat(voucher3, is("2-AAA33"));
    }
}
