package main.fruits;

public class PeachFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        // TODO Auto-generated method stub
        return new Peach();
    }
}
