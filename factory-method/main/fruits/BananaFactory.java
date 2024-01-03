package main.fruits;

public class BananaFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }
}
