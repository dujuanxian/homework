import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingManager {
    private final List<ParkingBoy> parkingBoys;

    public ParkingManager(ArrayList<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public Parking parkCar(String carId) {
        return getAvailableParkingBoys().get(0).parkCar(carId);
    }

    public String pickupCar(Parking parking) {
        String carId = null;
        for(ParkingBoy parkingBoy : this.parkingBoys) {
            String result = parkingBoy.pickupCar(parking);
            if (result != null) {
                carId = result;
            }
        }
        return carId;
    }

    protected List<ParkingBoy> getAvailableParkingBoys() {
        return this.parkingBoys
                .stream()
                .filter((parkingBoy) -> !parkingBoy.getAvailableParkingLots().isEmpty())
                .collect(Collectors.toList());
    }

}
