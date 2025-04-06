import java.util.Scanner;

public class Else_if_18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Age :");
        int age=sc.nextInt();

        if(18<age && age<=28){
            System.out.println("Your are Fresher ");
        }
        else if(age>28 && age<38){
            System.out.println("Your are Experienced ");
        }
        else if(age>38){
            System.out.println("Your Know About Field");
        }
        else{
            System.out.println("You Doesn't have Any Experienced");
        }
    }
}
