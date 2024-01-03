package main;

import main.houses.SemiDetachedHouse;

public class Main {
    public static void main(String[] args) {
        SemiDetachedHouse house1 = new SemiDetachedHouse(false, 10, 700.000);

        SemiDetachedHouse house2 = house1; // house1 reference
        SemiDetachedHouse house3 = (SemiDetachedHouse) house2.clone(); // cloning object

        house2.setPrice(200.000); // changes in house1 and house2
        house3.setSold(true); // changes only in house3

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());
    }
}
