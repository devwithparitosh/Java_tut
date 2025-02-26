/*Ques3:-WAP to which ask the user to enter her/his name and greets them with "hello <name>, have a nice day*/

import java.util.Scanner;

public class tut_Q3_07 {
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);

        System.out.print("Enter the you name : ");
        String a=s1.nextLine();

        System.out.println("Hello "+a+", have a good day");
    }
}
