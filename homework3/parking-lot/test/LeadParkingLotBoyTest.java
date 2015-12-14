import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LeadParkingLotBoyTest {
    @Test
    public void shouldChooseHighestVacancyRateParkingLot() {
        ParkingLot parkingLot1 = new ParkingLot(4, "lot-1");
        ParkingLot parkingLot2 = new ParkingLot(5, "lot-2");
        
        ArrayList<ParkingLot> parkingLots = 
                new ArrayList<>(Arrays.asList(parkingLot1, parkingLot2));

        ParkingLotBoy manager = new LeadParkingLotBoy(parkingLots);
        Parking parking1 = manager.parkCar("AAA11");
        Parking parking2 = manager.parkCar("AAA22");
        Parking parking3 = manager.parkCar("AAA33");
        Parking parking4 = manager.parkCar("AAA44");
        
        assertThat(parking1.carId, is("AAA11"));
        assertThat(parking1.parkingLotNumber, is("lot-1"));
        assertThat(parking2.carId, is("AAA22"));
        assertThat(parking2.parkingLotNumber, is("lot-2"));
        assertThat(parking3.carId, is("AAA33"));
        assertThat(parking3.parkingLotNumber, is("lot-2"));
        assertThat(parking4.carId, is("AAA44"));
        assertThat(parking4.parkingLotNumber, is("lot-1"));
    }
}
