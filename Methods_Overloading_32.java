//With method overloading, multiple methods can have the same name with different parameters
//Method overloading is a feature in Java that allows multiple methods with the same name but different parameter lists to exist within the same class. It enhances the flexibility and readability of the code.

import java.util.Scanner;

public class Methods_Overloading_32 {

    static int sum(int x,int y){
        return x+y;
    }

    static int sum(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number :");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number :");
        int num2=sc.nextInt();
        System.out.print("Enter the Third Number :");
        int num3=sc.nextInt();

        System.out.println("Sum of two number is :"+ sum(num1,num2));
        System.out.println("Sum of three number is :"+ sum(num1,num2,num3));

    }
}
