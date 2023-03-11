package SetterGetter;

public class Doctor
{
    private String name;
    private String id;
    private String hospital;
    private String phoneNo;

    public void setData (String name, String id, String hospital, String phoneNo)
    {
        this.name = name;
        this.id = id;
        this.hospital = hospital;
        this.phoneNo = phoneNo;
    }

    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }

    public void display ()
    {
        System.out.println("Name is " + getName() );
        System.out.println("Id is " + getId() );
        System.out.println("Hospital is " + hospital);
        System.out.println("Phone no is " + phoneNo);
    }

    public static void main(String[] args)
    {
        Doctor dc = new Doctor();
        dc.setData("Rupas", "4751", "Enam", "222");
        dc.display();
    }
}
