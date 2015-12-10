import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ParkingLot {
    private final int space;
    private List<Parking<String, String>> parkings = new ArrayList<>();

    public ParkingLot(int space) {
        this.space = space;
    }

    public Parking parkCar(String carId) {
        if (hasSpace()) {
            Parking parking = new Parking(carId, String.valueOf(parkings.size()));
            this.parkings.add(parking);
            return parking;
        }
        return null;
    }

    public String pickupCar(String carId) {
        List<Parking> parkingList = parkings.stream()
                .filter((p) -> Objects.equals(p.carId, carId))
                .collect(Collectors.toList());
        return parkingList.isEmpty() ? null : (String) parkingList.get(0).carId;
    }

    public boolean hasSpace() {
        return parkings.size() < space;
    }
}
