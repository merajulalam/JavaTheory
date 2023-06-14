package Question_Inheritance;

class SuperVehicle{
    protected int speed;

    public SuperVehicle(int speed){
        this.speed = speed;
    }
    public void display()
    {
        System.out.println("Super speed " + speed);
    }
}
class SuperCar extends SuperVehicle{
    private int speed;
    public SuperCar(int s1, int s2){
        super(s1);
        this.speed= s2;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Super car speed " + speed);
    }

    public static void main(String[] args) {
        SuperCar obj = new SuperCar(1, 2);

        obj.display();
    }
}


public class SuperCheck
{
}
