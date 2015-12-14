import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JuniorParkingLotBoy extends ParkingLotBoy{
    public JuniorParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    protected List<ParkingLot> getAvailableParkingLots() {
        return this.parkingLots
        .stream()
        .filter(ParkingLot::hasSpace)
        .collect(Collectors.toList());
    }
}
