import java.util.ArrayList;
import java.util.List;

public class LeadParkingLotBoy extends ParkingLotBoy {
    public LeadParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    protected List<ParkingLot> getAvailableParkingLots() {
        this.parkingLots.sort((p1, p2) -> Double.compare(p2.getSpaceVacancyRate(), p1.getSpaceVacancyRate()));
        return this.parkingLots;
    }
}
