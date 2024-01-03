package main.fruits;

public class AppleFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
