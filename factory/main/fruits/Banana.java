package main.fruits;

public class Banana implements Fruit {
    @Override
    public void color() {
        System.out.println("yellow");
    }

    @Override
    public void size() {
        System.out.println("15cm");
    }
}
