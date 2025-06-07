//Inheritance in interface

interface ParentInterface{
    void hairColor();
    void height();
}

interface ChildInterface extends ParentInterface{         //Multiple Inheritance:
    void skinColor();
    void nation();
}

class GrandChild implements ChildInterface{           //Runtime Polymorphism (Method Overriding)
    @Override
    public void hairColor(){
        System.out.println("Color of parent of Grand Child is Brown");
    }

    @Override
    public void height(){
        System.out.println("HEight is 6.6ft");
    }

    @Override
    public void skinColor(){
        System.out.println("Skin Color is Pale");
    }

    @Override
    public void nation(){
        System.out.println("Nation is India");
    }
}

public class Interface_inheritance_58 {
    public static void main(String[] args){
        GrandChild grand=new GrandChild();       // This creates an object of `GrandChild` and stores it in a variable of type `GrandChild`.
        grand.height();

        ParentInterface p=new GrandChild();      //This uses a reference of type `ParentInterface` to point to an object of `GrandChild`.

//        p.skinColor();                         //not access able because object of grandcHILD ONLY allow to acess ParentInterface methods
        p.hairColor();

        ChildInterface ch=new GrandChild();      //This uses a reference of type `ChildInterface` to point to an object of `GrandChild`.
        ch.height();
        ch.skinColor();
        ch.nation();
    }
}
