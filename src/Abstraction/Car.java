package Abstraction;

public abstract class Car {
    int speed;
    int mileage;
    public abstract void start();
}

class Honda extends Car{
    @Override
    public void start() {
        System.out.println("Honda Car started");
    }
}

class Ferrari extends Car{
    @Override
    public void start() {
        System.out.println("Ferrari Car started");
    }
}