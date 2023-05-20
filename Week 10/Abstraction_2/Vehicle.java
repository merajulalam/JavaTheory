package Abstraction_2;

public abstract class Vehicle {
    public Vehicle()
    {
        System.out.println("Vehicle here");
    }
    public abstract void move();

    public void carry()
    {
        System.out.println("Carrying Cows");
    }
}

class Car extends Vehicle
{
    @Override
    public void move()
    {
        System.out.println("Car is moving faster");
    }
}

class Boat extends Vehicle
{
    @Override
    public void move()
    {
        System.out.println("Boat is moving");
    }
}
