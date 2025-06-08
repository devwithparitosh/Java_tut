//Q1:-Create an abstract class Pen with Methods Write() and Refill() as Abstract methods.
//Q2:-Use the Pen class from Q1 to create a concrete class FountainPen with additional methos Changenib()

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing is smooth");
    }
    public void refill(){
        System.out.println("Refill the Blue ink");
    }
    public void changeNib(){
        System.out.println("Ball nib is install to the pen");
    }
}

public class InterPrac_Q1_60 {
    public static void main(String[] args){
        FountainPen natraj=new FountainPen();

        natraj.changeNib();
        natraj.refill();
    }
}
