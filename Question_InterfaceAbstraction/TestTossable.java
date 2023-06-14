package Question_InterfaceAbstraction;

interface Tossable{
    public void toss();
}

class Rock implements Tossable{
    @Override
    public void toss() {
        System.out.println("Rock tossing");
    }
}

abstract class Ball implements Tossable{
    private String brandName;

    public Ball (String brandName){
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void bounce(){
        System.out.println("Ball bouncing");
    }
}

class BaseBall extends Ball{
    public BaseBall(String bbc) {
        super(bbc);
    }
    @Override
    public void toss() {
        System.out.println("Baseball tossing");
    }

    @Override
    public void bounce() {
        System.out.println("Baseball bouncing");
    }
}

class Football extends Ball{
    public Football(String fbc)
    {
        super(fbc);
    }

    @Override
    public void toss() {
        System.out.println("Football tossing");
    }

    @Override
    public void bounce() {
        System.out.println("Football");
    }
}



public class TestTossable {
    public static void main(String[] args) {
        Rock r = new Rock();
        r.toss();

        BaseBall bb = new BaseBall("221");
        bb.toss();
        bb.bounce();
        System.out.println(bb.getBrandName());

        BaseBall fb = new BaseBall("221");
        fb.toss();
        fb.bounce();
        System.out.println(fb.getBrandName());


    }
}
