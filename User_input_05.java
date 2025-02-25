import java.util.Scanner;

public class User_input_05 {
    public static void main(String[] args){
        System.out.println("Taking the input of user :");
        Scanner sc= new Scanner(System.in);   //Note:- (System.in) is taking a input form the keyboard.

        System.out.println("Enter the num 1:");
        int a=sc.nextInt();                    //nextInt() is a predefine method which takes input integer and move to other input if available.
        System.out.println("Enter the num 2:");
        int b=sc.nextInt();

        int sum=(a+b);

        System.out.print("The sum of two number is : ");
        System.out.println(sum);

        //Note:- (println) prints the syntax in next_line. (print) syntax in current_line.

        //let verify the enter input is integer or not by hasNextInt().

        boolean b1=sc.hasNextInt();  //by default value is false of boolean.
        System.out.println(b1);

        //String Input
        String str=sc.next();   // It only takes single string as input
        System.out.print(str);

        String str2=sc.nextLine();
        System.out.print(str2);   //it take multiple input of string
    }
}
