package Week_9;

public class Person {
    protected String name = "Meraj";
    protected int age = 23;
}

class Student extends Person
{
    private int id = 5632;
    private double cgpa = 3.85;

    public void display ()
    {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Id " + id);
        System.out.println("CGPA" + cgpa);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.display();
    }
}
