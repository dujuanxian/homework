import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SeniorParkingLotBoy extends ParkingLotBoy{
    public SeniorParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    protected List<ParkingLot> getAvailableParkingLots() {
        this.parkingLots.sort(new Comparator<ParkingLot>() {
            @Override
            public int compare(ParkingLot o1, ParkingLot o2) {
                if (o1.getSpace() < o2.getSpace()) {
                    return 1;
                }
                return -1;
            }
        });
        return this.parkingLots;
    }
}
