package Question_InterfaceAbstraction;
interface Machine{
    void start();
    void stop();
}

class Car implements Machine{
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopping");
    }
}

class WaterPump implements Machine{
    @Override
    public void start() {
        System.out.println("Water Pump starting");
    }

    @Override
    public void stop() {
        System.out.println("Water Pump stopping");
    }
}

public class MachineTest
{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();

        WaterPump wp = new WaterPump();
        wp.start();
        wp.stop();
    }
}
