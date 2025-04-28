//-->Inheritance in Java enables a class to inherit properties and actions from another class, called a superclass or parent class. A class derived from a superclass is called a subclass or child group. Through inheritance, a subclass can access members of its superclass (fields and methods), enforce reuse rules, and encourage hierarchy.


//-->Single Inheritance
//   When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.

class Base{
    int x;

    public void setX(int x1){
        x=x1;
        System.out.println("I am in Base Class");
    }
    public int getX(){
        return x;
    }
}

class Derived extends Base{
    int y;

    public void setY(int y1){
        System.out.println("I am in Derived Class");
        y=y1;
    }
    public int getY(){
        return y;
    }
}

public class Inheritance_45 {
    public static void main(String[] args){

        Derived d=new Derived();    //create the object of derived class
        d.setX(10);                 //Access the base class method through derived class object
        System.out.println("Print the base class method through Derived class "+d.getX());

        Base b=new Base();           //create the object of base class
        b.setX(20);
        System.out.println("Access the Base class "+b.getX());

//        b.setY();     you can't be able to access the Derived class method through base class
    }
}
