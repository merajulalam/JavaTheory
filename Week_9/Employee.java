package Week_9;

public class Employee
{
    int salary = 30000;
}

class Programmer extends Employee
{
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary is " + p.salary);
        System.out.println("Bonus is " + p.bonus);
        System.out.println("Total is " + (p.salary+p.bonus) );
    }
}
