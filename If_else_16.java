import java.util.Scanner;

public class If_else_16 {
    public static void main(String[] args){
//        int age=6;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age :");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("No Boy you can't drive yet");
        }
    }
}
