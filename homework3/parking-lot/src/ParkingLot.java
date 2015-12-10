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
        if (hasSpace()) {
            Parking parking = new Parking(parkings.size(), carId);
            this.parkings.add(parking);
            return parking.getVoucher();
        }
        return null;
    }

    public String pickupCar(String voucher) {
        List<Parking> parkingList = parkings.stream()
                .filter((p) -> Objects.equals(p.getVoucher(), voucher))
                .collect(Collectors.toList());
        return parkingList.isEmpty() ? null : parkingList.get(0).getCarId();
    }

    public boolean hasSpace() {
        return parkings.size() < space;
    }
}
