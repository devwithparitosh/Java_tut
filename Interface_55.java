
interface Bicycle1{
    int price=2000;
    void applyBreak1();
    void speedUp();
}

interface HornBicycle{
    void blowHorn();
}

class AvonCycle1 implements Bicycle1,HornBicycle{

    @Override
    public void speedUp(){
        System.out.println("Applying speedUp");
    }

    @Override
    public void applyBreak1(){
        System.out.println("Applying Break");
    }

    @Override
    public void blowHorn(){
        System.out.println("pop pop....");
    }
    public void horn(){
        System.out.println("Pee Pee.....");
    }
}

public class Interface_55 {
    public static void main(String[] args) {

        AvonCycle1 av=new AvonCycle1();

        av.applyBreak1();
        av.speedUp();
        av.horn();
        av.blowHorn();

        //we can create property is interfaces
        System.out.println(av.price);

        //And we can't modify or change the value of properties in interface because they are final

//        av.price=3000;
//        System.out.println(av.price);
    }
}
