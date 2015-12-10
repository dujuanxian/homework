import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public String pickupCar(String voucher) {
        Parking parking = parkings.stream()
                .filter((p) -> Objects.equals(p.getVoucher(), voucher))
                .collect(Collectors.toList())
                .get(0);
        return parking.getCarId();
    }
}
