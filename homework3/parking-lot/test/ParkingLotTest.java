import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyOrNullString;

public class ParkingLotTest {
    @Test
    public void shouldParkCarWhenParkingLotHasSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        String voucher = parkingLot.parkCar("AAA11");
        assertThat(voucher, is("0-AAA11"));
    }

    @Test
    public void shouldNotParkCarWhenParkingLotHasNoSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar("AAA11");
        String voucher = parkingLot.parkCar("AAA12");
        assertThat(voucher, isEmptyOrNullString());
    }
    
    @Test
    public void shouldPickupByVoucher() {
        ParkingLot parkingLot = new ParkingLot(10);
        String voucher = parkingLot.parkCar("AAA11");
        String carId = parkingLot.pickupCar(voucher);
        assertThat(carId, is("AAA11"));
    }

    @Test
    public void shouldNotPickupWhenVoucherIsInvalid() {
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.parkCar("AAA11");
        String carId = parkingLot.pickupCar("BBB22");
        assertThat(carId, isEmptyOrNullString());
    }
}
