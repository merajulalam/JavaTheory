package Question_Inheritance;
class Teacher {

    public String decignation = "Teacher";
    public String uniName = "DIU";

    public void job() {
        System.out.println("teaching");
    }

}
 class CseTeacher extends Teacher{
            String mainSubject= "math";
        }




        public class CSETest {
            public static void main(String[] args) {
                CseTeacher obj = new CseTeacher();
                System.out.println(obj.uniName);
                System.out.println(obj.decignation);
                System.out.println(obj.mainSubject);
                obj.job();


            }
        }
