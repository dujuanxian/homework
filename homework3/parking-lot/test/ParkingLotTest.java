import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParkingLotTest {
    @Test
    public void shouldParkCarWhenParkingLotHasSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        String voucher = parkingLot.parkCar("AAA11");
        assertThat(voucher, is("0-AAA11"));
    }
}
