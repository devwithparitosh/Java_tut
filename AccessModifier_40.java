//public  -->	The code is accessible for all classes
//private  -->	The code is only accessible within the declared class
//default  -->	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
//protected--->	The code is accessible in the same package and subclasses.

class Myemp{
    private int id;
    private String name;

    public void setName(String n){
        this.name=n;
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
public class AccessModifier_40 {
    public static void main(String[] args){
        Myemp rohan=new Myemp();

        rohan.setId(100);
        rohan.setName("Rohan");

        System.out.println("Employee name is "+rohan.getName());
        System.out.println("ID is "+rohan.getId());
    }
}
