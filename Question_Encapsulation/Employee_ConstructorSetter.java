package Question_Encapsulation;

class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


}

public class Employee_ConstructorSetter {
    public static void main(String[] args) {
        Employee ep = new Employee("Meraj", 221, 3.50);

        System.out.println("Name is " + ep.getName() + "\nID is " + ep.getId() + " \nSalary is " + ep.getSalary());

        ep.setName("Ronaldo");
        ep.setId(7);
        ep.setSalary(3.50);
        System.out.println("Name is " + ep.getName() + "\nID is " + ep.getId() + " \nSalary is " + ep.getSalary());
    }
}
