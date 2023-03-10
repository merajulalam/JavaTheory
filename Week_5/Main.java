package Week_5;

class Overloading
{
    Overloading (int a, int b)
    {
        System.out.println("This is constructor sum = " + (a+b) );
    }
    Overloading (int a, int b, int c)
    {
        System.out.println("This is constructor(2) sum = " + (a+b+c) );
    }
    public void sum (int a, int b)
    {
        System.out.println("This is method overloaded(1) sum = " + (a+b) );
    }
    public void sum (double a, double b)
    {
        System.out.println("This is method overloaded(2) sum = " + (a+b) );
    }
    public void sum (int a, int b, int c)
    {
        System.out.println("This is method overloaded(3) sum = " + (a+b+c) );
    }
}

public class Main
{
    public static void main(String[] args) {
        Overloading ol = new Overloading(1, 2);

        ol.sum(1, 2);
        ol.sum(2.1, 2);
        ol.sum(1, 2, 3);

        Overloading ol2 = new Overloading(1, 2, 3);
    }

}
