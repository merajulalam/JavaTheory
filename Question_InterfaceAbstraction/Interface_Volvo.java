package Question_InterfaceAbstraction;

abstract class Vehicle{
    protected String model;

    public Vehicle(String model){
        this.model = model;
    }
    public abstract void move();

    public void controlSpeed(){
        System.out.println("Speed controlling");
    }
}

interface Drive{
    public void startEngine();
    public void stopEngine();
}

public class Interface_Volvo extends Vehicle implements Drive {

    private double price;

    public Interface_Volvo (double price) {
        super("s3x");
        this.price = price;
    }
    @Override
    public void move() {
        System.out.println("Volvo moving");
    }

    @Override
    public void startEngine() {
        System.out.println("Volvo engine starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Volvo engine stopping");
    }

    public static void main(String[] args) {
        Interface_Volvo ifV = new Interface_Volvo(3.2);

        System.out.println(ifV.model);
        ifV.move();
        ifV.startEngine();
        ifV.stopEngine();
    }
}
