package Week_2;

public class NewClass
{
    int max = 100;
    static int var = 50;

    public static void sum()
    {
        NewClass obj2 = new NewClass();
        System.out.println("After calling method");
        System.out.println(obj2.max);
        System.out.println(obj2.var);

    }

    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Sum of a and b = " + (a+b) );

        NewClass obj = new NewClass();
        System.out.println("After creating object");
        System.out.println(obj.max);
        System.out.println(obj.var);

        sum();


    }
}
