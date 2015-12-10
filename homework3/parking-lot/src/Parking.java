public class Parking {
    private final String carId;
    private final int spaceNumber;

    public Parking(int spaceNumber, String carId) {
        this.spaceNumber = spaceNumber;
        this.carId = carId;
    }

    public String getCarId() {
        return carId;
    }

    public String getVoucher() {
        return this.spaceNumber + "-" + this.carId;
    }
}
