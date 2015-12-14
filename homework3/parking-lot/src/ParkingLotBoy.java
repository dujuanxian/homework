import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingLotBoy {
    private final ArrayList<ParkingLot> parkingLots;

    public ParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Parking parkCar(String carId) {
        List<ParkingLot> availableParkingLots = 
                this.parkingLots
                .stream()
                .filter(ParkingLot::hasSpace)
                .collect(Collectors.toList());
        return availableParkingLots.isEmpty() ? null : availableParkingLots.get(0).parkCar(carId);
    }
}
