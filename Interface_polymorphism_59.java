

interface Myphone {
    void gps();
    void callandrecevice();
}

interface MySmartPhone extends Myphone{
    void camra();
    void internet();
}

class TouchPhone implements MySmartPhone{
    @Override
    public void camra() {
        System.out.println("Access the camera");
    }
    public void internet(){
        System.out.println("Connecting to the internet ");
    }
    @Override
    public void gps(){
        System.out.println("Access the gps");
    }
    @Override
    public void callandrecevice(){
        System.out.println("Call the person");
    }
}
public class Interface_polymorphism_59 {
    public static void main(String[] args){
        Myphone p=new TouchPhone();
        p.callandrecevice();
//        p.internet();             //Can't be able to access the method

        TouchPhone oppo=new TouchPhone();
        oppo.camra();
    }
}
