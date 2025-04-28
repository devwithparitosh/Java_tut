//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not a method body. It is used to achieve abstraction and multiple inheritance in Java.

interface Bicycle{
    void applyBreak();
    void speed();
}

class AvonCycle implements Bicycle{
    @Override
    public void applyBreak() {
        System.out.println("Apply the in Avon Cycle");
    }
    public void speed(){
        System.out.println("Speed up the Avon Cycle");
    }
}
public class Interface_54 {
    public static void main(String[] args) {

        Bicycle b=new AvonCycle();
        b.applyBreak();
    }
}
