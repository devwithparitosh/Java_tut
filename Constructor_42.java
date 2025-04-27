//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes


class MyEmp1{
    private int id;
    private String name;
    public MyEmp1(){      //Constructor
        id=10;
        name="Rolex";
        System.out.println("This is constructor");
    }

    public MyEmp1(String myName){     //constructor overloading
        id=0;
        name=myName;
        System.out.println("This is Second Constructor");
    }

    public MyEmp1(String myName,int i){
        id=i;
        name=myName;
        System.out.println("This is a Third constructor");
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class Constructor_42 {
    public static void main(String[] args) {
        MyEmp1 rony=new MyEmp1();

        MyEmp1 rohan=new MyEmp1("Rohan");

        MyEmp1 ravi=new MyEmp1("Ravi",12);

        System.out.println(rony.getId());
        System.out.println(rony.getName());        //This is for Default Constructor

        System.out.println(ravi.getId());
        System.out.println(ravi.getName());

        System.out.println(rohan.getId());
        System.out.println(rohan.getName());
    }
}
