//Multiple inheritance is not supported in the case of a class because of ambiguity. However, it is supported in the case of an interface because there is no ambiguity. Because the implementation class provides its implementation.

interface Gps{
    void maps();
    void location();
}
interface Camera{
    void Photo();
}
interface MediaPlayer{
    void Album();
}

class CellPhone1{
    public void call(){
        System.out.println("Calling a Person.....");
    }
    public void Received(){
        System.out.println("Received a call.....");
    }
}

class SmartPhone1 extends CellPhone1 implements Gps,Camera,MediaPlayer{

    @Override
    public void maps(){
        System.out.println("Maps IS located the place in Smartphone");
    }

    @Override
    public void location(){
        System.out.println("Location gives the info about place in SmartPhone");
    }

    @Override
    public void Photo() {
        System.out.println("Click the Photo in SmartPhone");
    }

    @Override
    public void Album() {
        System.out.println("Stores the Collection of Songs In SmartPhone");
    }
}

public class Inheritance_Multiple_56 {
    public static void main(String[] args) {
        SmartPhone1 sm=new SmartPhone1();

        sm.call();
        sm.Received();
        sm.location();
        sm.Album();
        sm.maps();
        sm.Photo();


        MediaPlayer mp=new SmartPhone1();
        sm.Album();

    }
}
