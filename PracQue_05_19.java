//QUE 4:- WAP a program to find whether a year entered by the user is leap year of not


import java.util.Scanner;

public class PracQue_05_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Year :");
        int year=sc.nextInt();

        boolean isleapYear=(year%400==0) || (year%4==0 && year%100 !=0);
        // year %400 is check which covers the century year and other if divisible bt 4 but not 100 it covers the non century years like 1944

        if (isleapYear){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
