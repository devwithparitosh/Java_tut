//Que3:-Use A comparsion operator to find out whether a given number is greater than the user entered numbere or not?

import java.util.Scanner;

public class Pra_Q3_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a = 56;

        System.out.print("Enter the number :");
        int num=sc.nextInt();

        if(num>=a){
            System.out.println("Entered value is greater than the given number.");
        }else{
            System.out.println("Entered valued is less than the given number. Guess higher number");
        }
    }
}
