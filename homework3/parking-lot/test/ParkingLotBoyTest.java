import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ParkingLotBoyTest {
    @Test
    public void shouldManagerPark2Cars() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>(Arrays.asList(new ParkingLot(10, "lot-1")));
        ParkingLotBoy manager = new ParkingLotBoy(parkingLots);
        Parking parking1 = manager.parkCar("AAA11");
        Parking parking2 = manager.parkCar("AAA22");
        assertThat(parking1.carId, is("AAA11"));
        assertThat(parking1.spaceNumber, is("0"));
        assertThat(parking1.parkingLotNumber, is("lot-1"));
        assertThat(parking2.carId, is("AAA22"));
        assertThat(parking2.spaceNumber, is("1"));
        assertThat(parking2.parkingLotNumber, is("lot-1"));
    }

    @Test
    public void shouldManagerPark2CarsInAnotherParkingLotWhenFirstIsFull() {
        ParkingLot parkingLot1 = new ParkingLot(1, "lot-1");
        ParkingLot parkingLot2 = new ParkingLot(10, "lot-2");
        
        ArrayList<ParkingLot> parkingLots = 
                new ArrayList<>(Arrays.asList(parkingLot1, parkingLot2));
        
        ParkingLotBoy manager = new ParkingLotBoy(parkingLots);
        Parking parking1 = manager.parkCar("AAA11");
        Parking parking2 = manager.parkCar("AAA22");
        
        assertThat(parking1.carId, is("AAA11"));
        assertThat(parking1.spaceNumber, is("0"));
        assertThat(parking1.parkingLotNumber, is("lot-1"));
        assertThat(parking2.carId, is("AAA22"));
        assertThat(parking2.spaceNumber, is("0"));
        assertThat(parking2.parkingLotNumber, is("lot-2"));
    }
}
