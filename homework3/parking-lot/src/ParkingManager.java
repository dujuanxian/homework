public class ParkingManager {
    private final ParkingBoy parkingBoy;

    public ParkingManager(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }

    public Parking parkCar(String carId) {
        return this.parkingBoy.parkCar(carId);
    }
}
