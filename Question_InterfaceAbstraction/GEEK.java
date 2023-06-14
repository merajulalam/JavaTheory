package Question_InterfaceAbstraction;

interface GFG{
    void learnCoding();
    void learnProgramming();
    void contribute();
}

abstract class Student implements GFG{
    @Override
    public void learnCoding() {
        System.out.println("Lets make coding a habit with GFG");
    }

    @Override
    public void learnProgramming() {
        System.out.println("Lets learn JAVA");
    }
}


public class GEEK extends Student{
    @Override
    public void contribute() {
        System.out.println("Lets help others to learn JAVA");
    }

    @Override
    public void learnCoding() {
        System.out.println("Lets make coding A habit with JAVA");
    }
}

class NewClass{
    public static void main(String[] args) {
        GEEK gfgStudent = new GEEK();

        gfgStudent.learnCoding();
        gfgStudent.learnProgramming();
        gfgStudent.contribute();
    }
}
