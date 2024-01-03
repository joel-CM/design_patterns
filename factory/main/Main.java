package main;

import main.fruits.FactorytFruit;
import main.fruits.Fruit;
import main.fruits.FruitTypes;

public class Main {
    public static void main(String[] args) {
        FactorytFruit factoryFruit = new FactorytFruit();

        Fruit peach = factoryFruit.createFruit(FruitTypes.PEACH);
        Fruit apple = factoryFruit.createFruit(FruitTypes.APPLE);

        peach.color();
        peach.size();
        apple.color();
        apple.size();
    }
}