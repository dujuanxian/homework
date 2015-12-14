public class ParkingManager {
    private final ParkingLotBoy parkingLotBoy;

    public ParkingManager(ParkingLotBoy parkingLotBoy) {
        this.parkingLotBoy = parkingLotBoy;
    }

    public Parking parkCar(String carId) {
        return this.parkingLotBoy.parkCar(carId);
    }
}
