

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
