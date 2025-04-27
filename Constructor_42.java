class MyEmp1{
    private int id;
    private String name;
    public MyEmp1(){      //Constructor
        id=10;
        name="Rolex";
        System.out.println("This is constructor");
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

        System.out.println(rony.getId());
        System.out.println(rony.getName());
    }
}
