
class Phone{
    public void color(){
        System.out.println("Phone is Red");
    }
    public void On(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void On(){
        System.out.println("Turning on SmartPhone....");
    }
    public void sound(){
        System.out.println("bark bark.....");
    }
}

public class DynamicAndDespatch_49 {
    public static void main(String[] args) {
        Phone p=new Phone();
        SmartPhone sm=new SmartPhone();

        //Super class can create a reference of subclass using object

//      superClass object = new subClass()

        Phone vivo = new SmartPhone();   //Allowed
        vivo.On();  //SmartPhone Class On() method will run
        vivo.color();

//        vivo.sound(); //not allowed

//        SmartPhone v=new Phone();      //not Allowed
    }
}
