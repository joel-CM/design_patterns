package main.houses;

import java.util.Objects;

public abstract class HousePrototype {
    protected boolean sold;
    protected int squareMeters;
    protected double price;

    public HousePrototype(boolean sold, int squareMeters, double price) {
        this.sold = sold;
        this.squareMeters = squareMeters;
        this.price = price;
    }

    public HousePrototype(HousePrototype housePrototype) {
        if (!Objects.isNull(housePrototype)) {
            this.setPrice(housePrototype.getPrice());
            this.setSold(housePrototype.isSold());
            this.setSquareMeters(housePrototype.getSquareMeters());
        }
    }

    public abstract HousePrototype clone();

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
