package Question_InterfaceAbstraction;

abstract class Fruits{
    public String color;

    public Fruits (String color){
        this.color = color;
    }
    public abstract void display();
}

class Apple extends Fruits{
    public Apple(String color){
        super(color);
    }

    @Override
    public void display() {
        System.out.println("Fruit name is Apple\nColor is " + super.color);
    }
}
class Banana extends Fruits{
    public Banana(String color){
        super(color);
    }

    @Override
    public void display() {
        System.out.println("Fruit name is Banana\nColor is " + super.color);
    }
}
class Jackfruit extends Fruits{
    public Jackfruit(String color){
        super(color);
    }

    @Override
    public void display() {
        System.out.println("Fruit name is Jackfruit\nColor is " + super.color);
    }
}

public class Abstract_Fruits
{
    public static void main(String[] args) {
        Apple a = new Apple("Red");
        a.display();

        Banana b = new Banana("Yellow");
        b.display();

        Jackfruit jf = new Jackfruit("Green");
        jf.display();
    }
}
