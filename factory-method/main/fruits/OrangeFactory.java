package main.fruits;

public class OrangeFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }
}
