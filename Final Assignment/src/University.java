
public class University
{
    public static void main(String[] args)
    {
        Employee [] arrEmployee = new Employee[3];
        arrEmployee[0] = new Professor(1, "Ratul", 800.15, "Pharmacy");
        arrEmployee[1] = new Administrator(2, "Asif", 700.95, "Software");
        arrEmployee[2] = new SupportStaff(3, "Santo", 500.12, "Manager");

        for (Employee employee : arrEmployee)
        {
            System.out.println(employee.toString() );
        }

        double totalSalary = Employee.totalSalary(arrEmployee);
        System.out.println("\nTotal salary: " + totalSalary);
    }
}
