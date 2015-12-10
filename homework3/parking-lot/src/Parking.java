public class Parking<A, B, C> {
    public final A carId;
    public final B spaceNumber;
    public final C parkingLotNumber;

    public Parking(A carId, B spaceNumber, C number) {
        this.spaceNumber = spaceNumber;
        this.carId = carId;
        this.parkingLotNumber = number;
    }
}
