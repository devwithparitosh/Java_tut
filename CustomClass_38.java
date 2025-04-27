
class Employee{                //Custom class
    int id;
    String name;
    int salary;
    public void printDetails(){      //Method
        System.out.print("The id is "+id);
        System.out.print(" and name of employee is " +name);
        System.out.println(" and salary is "+salary);

    }
}

public class CustomClass_38 {
    public static void main(String[] args){
        Employee rohan=new Employee();        //Creating the class instance (or Object)
        Employee ravi=new Employee();

        //Setting Attributes
        rohan.id=100;
        rohan.name="Rohan";
        rohan.salary=50000;

        ravi.id=101;
        ravi.name="Ravi";
        ravi.salary=60000;

        /*System.out.println(rohan.id);
        System.out.println(rohan.name);
        System.out.println(rohan.salary);     //normal way too call the attributes
         */

        rohan.printDetails();
        ravi.printDetails();
    }
}
