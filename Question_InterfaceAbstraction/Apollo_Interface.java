package Question_InterfaceAbstraction;
abstract class SpaceCraft{
    protected String model;

    public SpaceCraft(String model){
        this.model = model;
    }
    public abstract void display();
}

interface Drive2{
    public void drive();
    public void stop();
    public void turn();
}
interface Shuttle{
    public void startShuttle();
    public void stopShuttle();

}

public class Apollo_Interface extends SpaceCraft implements Drive2, Shuttle{
    private int nowheel;

    public Apollo_Interface(int nowheel){
        super("Apollo 11");
        this.nowheel = nowheel;
    }

    @Override
    public void display() {
        System.out.println(nowheel);
        System.out.println(super.model);
    }
    @Override
    public void drive() {
        System.out.println("Driving");
    }
    public void stop(){
        System.out.println("stopping");
    }
    public void turn(){
        System.out.println("turning");
    }
    public void startShuttle(){
        System.out.println("Starting shuttle");
    }
    public void stopShuttle(){
        System.out.println("Stopping shuttle");
    }

    public static void main(String[] args) {

        Apollo_Interface A = new Apollo_Interface(1);
        A.display();
    }
}
