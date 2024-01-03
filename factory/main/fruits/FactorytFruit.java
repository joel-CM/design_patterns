package main.fruits;

public class FactorytFruit implements IFactoryFruit {
    @Override
    public Fruit createFruit(FruitTypes fruitType) {
        switch (fruitType) {
            case BANANA:
                return new Apple();
            case APPLE:
                return new Apple();
            case ORANGE:
                return new Orange();
            case PEACH:
                return new Peach();
            default:
                return new Banana();
        }
    }
}