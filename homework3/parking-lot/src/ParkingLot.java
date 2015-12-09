import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Parking> parkings = new ArrayList<>();

    public ParkingLot() {}

    public String parkCar(String carId) {
        Parking parking = new Parking(parkings.size(), carId);
        this.parkings.add(parking);
        return parking.getVoucher();
    }
}
