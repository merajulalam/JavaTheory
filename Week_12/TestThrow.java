package Week_12;

public class TestThrow
{
    static void validate (int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Not valid");

        }
    else
        {
            System.out.println("Welcome");

        }
    }

    public static void main(String[] args) {
        validate(19);

        System.out.println("Rest of the code");

    }
}
