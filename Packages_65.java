/*-->Packages in Java are a mechanism that encapsulates a group of classes, sub-packages, and interfaces. Packages are used for:

    >Prevent naming conflicts by allowing classes with the same name to exist in different packages, like college.staff.cse.Employee and college.staff.ee.Employee.
    >They make it easier to organize, locate, and use classes, interfaces, and other components.
    >Packages also provide controlled access for Protected members that are accessible within the same package and by subclasses.
    >Also, default members (no access specifier) are accessible only within the same package.

By grouping related classes into packages, Java promotes data encapsulation, making code reusable and easier to manage. Simply import the desired class from a package to use it in your program. */

public class Packages_65 {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);        //In this line we import the Scanner package directly without import declaration

        System.out.print("Enter the number :");
        int a=sc.nextInt();

        System.out.println(a);
    }
}
