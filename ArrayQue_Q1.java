//Q:-	WAP to store the ages of 5 people. Throw a user-defined exception if the entered age is less than 0 or more than 120.

import java.util.Scanner;

public class ArrayQue_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []age=new int[5];

        for (int i=0;i< age.length;i++){
            age[i]=sc.nextInt();
        }
    }
}
