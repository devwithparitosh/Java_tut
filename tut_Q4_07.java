/*Q4:- WAP a program to convert kilometer to miles.*/
import java.util.Scanner;

public class tut_Q4_07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Kilometer: ");
        float k=sc.nextFloat();

        float miles=k/1.609344f;

        System.out.println(k+" Kilometer is equal to"+ miles+" miles.");
    }
}
