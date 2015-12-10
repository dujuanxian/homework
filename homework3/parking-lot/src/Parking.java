public class Parking<A, B> {
    public final A carId;
    public final B spaceNumber;

    public Parking(A carId, B spaceNumber) {
        this.spaceNumber = spaceNumber;
        this.carId = carId;
    }
}
