public class Parking<A, B, C> {
    public final A carId;
    public final B spaceNumber;
    public final C parkingLotNumber;

    public Parking(A carId, B spaceNumber, C number) {
        this.spaceNumber = spaceNumber;
        this.carId = carId;
        this.parkingLotNumber = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parking parking = (Parking) o;

        if (carId != null ? !carId.equals(parking.carId) : parking.carId != null) return false;
        if (parkingLotNumber != null ? !parkingLotNumber.equals(parking.parkingLotNumber) : parking.parkingLotNumber != null)
            return false;
        if (spaceNumber != null ? !spaceNumber.equals(parking.spaceNumber) : parking.spaceNumber != null) return false;

        return true;
    }

    public A getCarId() {
        return carId;
    }

    public C getParkingLotNumber() {
        return parkingLotNumber;
    }
}
