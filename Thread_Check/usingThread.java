package Thread_Check;

class Trd1 extends Thread{
    public void run(){
        for (int i=1; i<=20; i++){
            System.out.println("Siiuuu");
        }

    }
}
class Trd2 extends Thread{
    public void run(){
        for (int i=1; i<=20; i++){
            System.out.println("naldo");
        }
    }
}
class Trd3 extends Thread{
    public void run(){
        for (int i=1; i<=20; i++)
        {
            System.out.println("CR7");
        }
    }
}

public class usingThread {
    public static void main(String[] args) {
        Trd1 t1 = new Trd1();
        Trd2 t2 = new Trd2();
        Trd3 t3 = new Trd3();

        t1.start();
        t2.start();
        t3.start();
    }
}
