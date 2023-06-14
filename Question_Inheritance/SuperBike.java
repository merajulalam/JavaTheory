package Question_Inheritance;
class Vehicle{
    public void run()
    {
        System.out.println("Vehicle running");
    }
}
class Bike extends Vehicle
{
    @Override
    public void run() {

        System.out.println("Bike running");
        super.run();
    }
}


public class SuperBike {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
        //super.run();
    }
}
