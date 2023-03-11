package Protected_Private;

public class Student extends Person
{
    private int id;
    private double cgpa;

    public Student (String name, int age, int id, double cgpa)
    {
        super(name, age);
        this.id = id;
        this.cgpa = cgpa;
    }

    public void display ()
    {
        super.display();
        System.out.println("ID is " + id);
        System.out.println("CGPA is " + cgpa);
    }

    public static void main(String[] args)
    {
        Student st = new Student("Saha", 22, 221, 3.97 );
        st.display();

    }
}
