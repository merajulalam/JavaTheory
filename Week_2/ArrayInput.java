package Week_2;

import java.util.Scanner;

public class ArrayInput
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array value");
        for (int i = 0; i < size; i++) {
            System.out.println("Elenemt " + i);
            arr[i] = input.nextInt();
        }

        System.out.println("The array values are");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Element " + i);
            System.out.println(" = " + arr[i]);
        }

    }
}
