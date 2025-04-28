//An abstract class is a class that cannot be instantiated directly. It serves as a blueprint for other classes. We define an abstract class using the abstract keyword.

//An abstract class can contain both abstract and concrete methods (where implementation is present).

abstract class Parent{                       //Abstract Class
    public void sayHEllo(){
        System.out.println("I am a Abstract Class");
    }

    abstract public void greet();                  //Abstract Method
}

class Child extends Parent{                //Concrete Class
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    public void SayChild(){
        System.out.println("HEllo child");
    }
}

abstract class Child2 extends Parent{            //Abstract Class
    public void name(){
        System.out.println("The name is Tank");
    }
}

public class AbstractClass_53 {
    public static void main(String[] args) {

        Child c=new Child();
        c.greet();
        c.sayHEllo();
        c.SayChild();

        Parent p1=new Child();
        p1.greet();
        p1.sayHEllo();
//        p1.SayChild();                 //not allowed


    }
}
