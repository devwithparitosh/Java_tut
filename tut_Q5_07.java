/*Q5:- WAp to detect whether a number  entered by the user is integer or not?*/

import java.util.Scanner;

public class tut_Q5_07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Word :");
        boolean b=sc.hasNextInt();

        if(b==true){
            System.out.println("It's an Integer");
        }else{
            System.out.println("It's not an integer");
        }

    }
}
