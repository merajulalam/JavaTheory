package Week_5;

import java.util.Scanner;

class Maximum
{
    int num1, num2;
    int maxValue;
    Maximum (int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int max()
    {
        if (num1>num2)
        {
            maxValue = num1;
        }
        else
        {
            maxValue = num2;
        }
        return maxValue;
    }
}

public class MaximumValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter first number");
        a = sc.nextInt();

        System.out.println("Enter second number");
        b = sc.nextInt();

        Maximum mx = new Maximum(a, b);

        System.out.println("The maximum number is " + mx.max() );


    }
}
