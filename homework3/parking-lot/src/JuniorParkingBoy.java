import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JuniorParkingBoy extends ParkingBoy {
    public JuniorParkingBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    protected List<ParkingLot> getAvailableParkingLots() {
        return this.parkingLots
        .stream()
        .filter(ParkingLot::hasSpace)
        .collect(Collectors.toList());
    }
}
