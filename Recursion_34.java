import java.util.Scanner;

public class Recursion_34 {

    static int fact(int n){

        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find it's factorial :");
        int num=sc.nextInt();

        System.out.println("Factorial of "+num+" is : "+fact(num));
    }
}
