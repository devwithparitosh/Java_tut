//subclass (child class) has the same method as declared in the parent class, it is known as method overriding.

//Rules for Java Method Overriding

//> Same Method Name: The overriding method in the subclass must have the same name as the method in the superclass that it is overriding.

//> Same Parameters: The overriding method must have the same number and types of parameters as the method in the superclass. This ensures compatibility and consistency with the method signature defined in the superclass.

//> IS-A Relationship (Inheritance): Method overriding requires an IS-A relationship between the subclass and the superclass. This means that the subclass must inherit from the superclass, either directly or indirectly, to override its methods.

//> Same Return Type or Covariant Return Type: The return type of the overriding method can be the same as the return type of the overridden method in the superclass, or it can be a subtype of the return type in the superclass. This is known as the covariant return type, introduced in Java 5.

//> Access Modifier Restrictions: The access modifier of the overriding method must be the same as or less restrictive than the access modifier of the overridden method in the superclass. Specifically, a method declared as public in the superclass can be overridden as public or protected but not as private. Similarly, a method declared as protected in the superclass can be overridden as protected or public but not as private. A method declared as default (package-private) in the superclass can be overridden with default, protected, or public, but not as private.

//> No Final Methods: Methods declared as final in the superclass cannot be overridden in the subclass. This is because final methods cannot be modified or extended.

//> No Static Methods: Static methods in Java are resolved at compile time and cannot be overridden. Instead, they are hidden in the subclass if a method with the same signature is defined in the subclass.

class A{
    public int x;
    public void meth(){
        System.out.println("This is a method of Class A");
    }
}
class B extends A{
    @Override
    public void meth(){         //override the method
        System.out.println("This is a Method of class B");
    }
}
public class Methods_Overriding_48 {
    public static void main(String[] args) {
        A a=new A();
//        a.meth();

        B b=new B();
        b.meth();
    }
}
