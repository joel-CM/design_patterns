package main.fruits;

public class Orange implements Fruit {
    @Override
    public void color() {
        System.out.println("orange");
    }

    @Override
    public void size() {
        System.out.println("105mm");
    }
}
