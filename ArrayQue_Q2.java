//Q:-WAP to find out Whether a given integer is present in array or not?

import java.util.Scanner;

public class ArrayQue_Q2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size=sc.nextInt();

        int []num=new int[size];

        for (int i=0;i< num.length;i++){
            num[i]=sc.nextInt();
        }


        System.out.print("Enter the number you want to find :");
        int findnum=sc.nextInt();

        sc.close();

        for (int i=0;i< num.length;i++){
            if(findnum==num[i]){
                System.out.println("It is present in the Array "+(num.length-1));
            }
            else {
                System.out.println("It is not present in the Array");
            }
        }


    }
}
