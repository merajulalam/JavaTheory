package Week_12;

public class TryCatch {

    public static void main(String[] args)
    {
        int a = 10, b = 1;

        try
        {
            int z = a / b;
            System.out.println("Inside try block " + z);
        }

        catch (NumberFormatException e1)
        {
            System.out.println("Number format exception");
        }
        catch (ArithmeticException e2)
        {
            System.out.println("Arithmetic Exception");
        }
        catch (NullPointerException e3)
        {
            System.out.println("Null pointer exception");
        }
        catch (ArrayIndexOutOfBoundsException e4)
        {
            System.out.println("Array index out of bounds exception");
        }

        catch(Exception e)
        {
            System.out.println("Exception " + e);
        }
        finally
        {
            System.out.println("Finally will be executed");
        }

        System.out.println("Rest of the code...");

    }

}
