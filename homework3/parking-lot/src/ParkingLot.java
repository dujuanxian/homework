import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int space;
    private List<Parking> parkings = new ArrayList<>();

    public ParkingLot(int space) {
        this.space = space;
    }

    public String parkCar(String carId) {
        if (parkings.size() < space) {
            Parking parking = new Parking(parkings.size(), carId);
            this.parkings.add(parking);
            return parking.getVoucher();
        }
        return null;
    }
}
