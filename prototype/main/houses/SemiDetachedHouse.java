package main.houses;

public class SemiDetachedHouse extends HousePrototype {
    public SemiDetachedHouse(boolean sold, int squareMeters, double price) {
        super(sold, squareMeters, price);
    }

    public SemiDetachedHouse(SemiDetachedHouse semiDetachedHouse) {
        super(semiDetachedHouse);
    }

    @Override
    public HousePrototype clone() {
        return new SemiDetachedHouse(this);
    }

    @Override
    public String toString() {
        return "SemiDetachedHouse [sold=" + this.isSold() + ", squareMeters=" + this.getSquareMeters() + ", price="
                + this.getPrice() + "]";
    }
}
