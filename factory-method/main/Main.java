package main;

import main.fruits.Fruit;
import main.fruits.OrangeFactory;
import main.fruits.PeachFactory;

public class Main {
    public static void main(String[] args) {
        PeachFactory peachFactory = new PeachFactory();
        OrangeFactory orangeFactory = new OrangeFactory();

        Fruit peach = peachFactory.createFruit();
        Fruit orange = orangeFactory.createFruit();

        peach.color();
        peach.size();
        orange.color();
        orange.size();
    }
}