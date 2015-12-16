import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class ParkingBoy {
    protected final ArrayList<ParkingLot> parkingLots;

    protected ParkingBoy(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    protected abstract List<ParkingLot> getAvailableParkingLots();

    public Parking parkCar(String carId) {
        return getAvailableParkingLots().isEmpty() ? null : getAvailableParkingLots().get(0).parkCar(carId);
    }

    public String pickupCar(Parking parking) {
        List<ParkingLot> parkingLotInCharge = parkingLots
                .stream()
                .filter((parkingLot) -> Objects.equals(parkingLot.getNumber(), parking.getParkingLotNumber()))
                .collect(Collectors.toList());
        if (!parkingLotInCharge.isEmpty()) {
            return parkingLotInCharge.get(0).pickupCar(parking);
        }
        return null;
    }
}
