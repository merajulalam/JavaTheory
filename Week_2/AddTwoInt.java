package Week_2;

import java.util.Scanner;

public class AddTwoInt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("The sum of two number : " + (a+b));

    }
}
