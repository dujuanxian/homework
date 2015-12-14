import java.util.ArrayList;
import java.util.List;

public class SeniorParkingBoy extends ParkingBoy {
    public SeniorParkingBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    protected List<ParkingLot> getAvailableParkingLots() {
        this.parkingLots.sort((p1, p2) -> p2.getAvailableSpace() - p1.getAvailableSpace());
        return this.parkingLots;
    }
}
