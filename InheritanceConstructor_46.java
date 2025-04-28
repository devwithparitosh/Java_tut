
class base1{

    base1(){                     //Default Constructor
        System.out.println("This is base class Constructor");
    }

    base1(int x){                 //Parameterised Constructor
        System.out.println("This is Overloaded constructor with value x :"+x);
    }
}

class dervired1 extends base1{

    dervired1(){                   //Default Constructor
        System.out.println("This is a Derived Class Constructor");
    }

    dervired1(int x,int y){              //Parameterised Constructor
        super(x);                       //Super keyword is used to0 call the parameterized constructor
        System.out.println("This is Derived Class overloaded constructor with a value of y :"+ y);
    }
}

class ChildOfDerived extends dervired1{
    ChildOfDerived(){                     //Default Constructor
        System.out.println("This is Constructor of default Child Of Derived Class");
    }
    ChildOfDerived(int x,int y,int z){            //Parameterised Constructor
        super(x,y);
        System.out.println("This is a parameterized constructor Child Of Derived class : "+z);
    }
}
public class InheritanceConstructor_46 {
    public static void main(String[] args){

//        base1 b1=new base1();
//        dervired1 d1=new dervired1();  //normal object creating and call the default constructor
//
//        dervired1 d2=new dervired1(20,10);

        ChildOfDerived c1=new ChildOfDerived(40,50,60);


    }
}
