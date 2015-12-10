import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLotManager {
    private final ArrayList<ParkingLot> parkingLots;

    public ParkingLotManager(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public String parkCar(String carId) {
        List<ParkingLot> availableParkingLots = 
                this.parkingLots
                .stream()
                .filter(ParkingLot::hasSpace)
                .collect(Collectors.toList());
        return availableParkingLots.isEmpty() ? null : availableParkingLots.get(0).parkCar(carId);
    }
}
