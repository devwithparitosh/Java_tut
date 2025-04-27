
class Emp{
    int salary;
    String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
}

public class MethodPrac_Q1_39 {
    public static void main(String[] args){
        Emp ravi=new Emp();

        ravi.setName("Ravi");
        ravi.setSalary(50000);

        System.out.println("Employee name :"+ravi.getName());
        System.out.print("Salary is :"+ravi.getSalary());
    }
}
