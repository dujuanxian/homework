import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.nullValue;

public class ParkingLotTest {
    @Test
    public void shouldParkCarWhenParkingLotHasSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(10);
        Parking parking = parkingLot.parkCar("AAA11");
        assertThat(parking.carId, is("AAA11"));
        assertThat(parking.spaceNumber, is("0"));
    }

    @Test
    public void shouldNotParkCarWhenParkingLotHasNoSpace() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar("AAA11");
        Parking parking = parkingLot.parkCar("AAA12");
        assertThat(parking, is(nullValue()));
    }
    
    @Test
    public void shouldPickupByVoucher() {
        ParkingLot parkingLot = new ParkingLot(10);
        Parking parking = parkingLot.parkCar("AAA11");
        String carId = parkingLot.pickupCar((String) parking.carId);
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
