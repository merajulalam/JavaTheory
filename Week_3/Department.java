package Week_3;

public class Department
{
    private String deptName;
    private int deptCode;
    private String faculty;

    public static void main(String[] args) {
        Department ob1 = new Department();
        ob1.deptName = "CSE";
        ob1.deptCode = 15;
        ob1.faculty = "FSIT";

        System.out.println("Department name " + ob1.deptName);
        System.out.println("Department code " + ob1.deptCode);
        System.out.println("Faculty name " + ob1.faculty);

        Department ob2 = new Department();
        ob2.deptName = "SWE";
        ob2.deptCode = 30;
        ob2.faculty = "FSIT";

        System.out.println("Department name " + ob2.deptName);
        System.out.println("Department code " + ob2.deptCode);
        System.out.println("Faculty name " + ob2.faculty);

    }
}
