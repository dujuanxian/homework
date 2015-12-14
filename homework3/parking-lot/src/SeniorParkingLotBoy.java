import java.util.ArrayList;
import java.util.List;

public class SeniorParkingLotBoy extends ParkingLotBoy{
    public SeniorParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    protected List<ParkingLot> getAvailableParkingLots() {
        this.parkingLots.sort((p1, p2) -> p2.getSpace() - p1.getSpace());
        return this.parkingLots;
    }
}
