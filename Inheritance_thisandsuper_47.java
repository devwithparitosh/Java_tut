//The super keyword in Java is a reference variable that is used to refer to immediate parent class objects.

//Advantages of super Keyword:
//-->Simplifies Constructor Chaining: The super() call ensures that the parent class's constructor is executed before the child class's, maintaining proper initialization across the inheritance hierarchy.

//-->Access to Overridden Methods: It allows a subclass to invoke a method from the parent class even when the subclass has overridden the method. This is useful for extending functionality without completely overriding it.

//-->Access to Hidden Fields: It provides access to parent class fields that subclass fields may hide with the same name.

//-->Code Reusability: By invoking the parent class's methods or constructors, it promotes code reuse and reduces redundancy.

//-->Maintains Hierarchical Relationships: It preserves and utilizes the hierarchical structure of inheritance, making the code more organized and easier to manage.

// this is a reference variable that refers to the current object.

//Advantages of this Keyword:

//> Avoids Confusion: If a method has a parameter with the same name as an instance variable, it helps refer to the instance variable.
//> Improves Readability: It makes it clear that you're working with the object's own data.
//> Simplifies Constructor Chaining: It allows one constructor to call another, reducing duplicate code.
//> Enables Method Chaining: We can call multiple methods in one statement, making the code cleaner.
//> Passes the Object Itself: Sometimes, you need to send the current object to another method, and this makes it easy.

//Disadvantages of this Keyword:

//> Risk of Misuse: It can cause bugs if instance and local variables aren't carefully distinguished.
//> .Coupling Issues: Tightly binds methods/constructors to the instance, reducing modularity.
//> Context Limitations: Not usable in static methods, adding complexity.
//> Memory Leaks: It may lead to leaks in certain cases like inner classes.
//> Multithreading Challenges: Using synchronization can cause performance issues.


class Base1{
    Base1(){
        System.out.println("This is a Constructor");
    }

    Base1(int i){
        System.out.println("This is a Parameterized constructor of Base "+i);
    }

    public int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;            //this can be used to assign the variable reference of same name like i
    }
}

class Derived2 extends Base1{
    Derived2(){
        System.out.println("This is default Constructor");
    }
    Derived2(int i,int j){
        super (i);
        System.out.println("This is a Parameterized constructor of Derived "+j);

    }
}
public class Inheritance_thisandsuper_47 {
    public static void main(String[] args) {
        Base1 b1=new Base1();
        Base1 b2=new Base1(10);


        b1.setI(20);
        System.out.println(b1.getI());

        Derived2 d1=new Derived2(30,40);
    }
}
