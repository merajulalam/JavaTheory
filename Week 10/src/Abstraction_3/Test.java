package Abstraction_3;

public class Test
{
    public static void main(String[] args)
    {
        Human h = new Human();
        h.life();
        h.eat();
        h.move();
        h.talk();
        System.out.println();

        Lion l = new Lion();
        l.eat();
        l.move();
        l.hunt();
        System.out.println();

        Bird b = new Bird();
        b.eat();
        b.move();
        b.fly();
    }
}
