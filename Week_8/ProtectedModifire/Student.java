package ProtectedModifire;

public class Student extends Person
{
    private int id;
    private double cgpa;

    public void display ()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("ID is " + id);
        System.out.println("CGPA is " + cgpa);
    }

    public static void main(String[] args)
    {
        Student st = new Student();
        st.name = "Meraj";
        st.age = 21;
        st.id = 221;
        st.cgpa = 3.69;
        st.display();

    }
}
