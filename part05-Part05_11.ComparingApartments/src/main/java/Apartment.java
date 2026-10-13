
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
        int dif = this.princePerSquare * this.squares - compared.princePerSquare * compared.squares;
        if (dif < 0) {
            dif = -dif;
        }
        return dif;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.princePerSquare * this.squares > compared.princePerSquare * compared.squares;
    }
}
