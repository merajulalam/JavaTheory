package Abstraction_1;

public abstract class Vehicle
{
    public Vehicle()
    {
        System.out.println("Vehicle Constructor");
    }
    public abstract void move();

    public void carry()
    {
        System.out.println("Carrying Eggs");
    }
}

class Car extends Vehicle
{
    @Override
    public void move()
    {
        System.out.println("Car is moving");
    }

    public static void main(String[] args)
    {
        Car car = new Car();

        car.move();
        car.carry();
    }
}
