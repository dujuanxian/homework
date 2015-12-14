import java.util.ArrayList;
import java.util.List;

public abstract class ParkingLotBoy {
    protected final ArrayList<ParkingLot> parkingLots;

    protected ParkingLotBoy(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    protected abstract List<ParkingLot> getAvailableParkingLots();

    public Parking parkCar(String carId) {
        return getAvailableParkingLots().isEmpty() ? null : getAvailableParkingLots().get(0).parkCar(carId);
    }
}
