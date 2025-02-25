/*
Exercise 1.1
Write a Program to calculate percentage of a given Student in CBSE board exam. His marks from 5 Subjects must be taken as input from the keyboard.(Marks are out of 100).*/

import java.util.Scanner;

public class tut_Q1_06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Student :");
        String name=sc.nextLine();
        System.out.println(name);

        System.out.print("Enter the marks of Maths: ");
        int marks1=sc.nextInt();
        System.out.print("Enter the marks of Science: ");
        int marks2=sc.nextInt();
        System.out.print("Enter the marks of Hindi: ");
        int marks3=sc.nextInt();
        System.out.print("Enter the marks of English: ");
        int marks4=sc.nextInt();
        System.out.print("Enter the marks of Social science: ");
        int marks5=sc.nextInt();

        float sum=(marks1+marks2+marks3+marks4+marks5);
        float per=sum/5;

        System.out.print("Total marks is : ");
        System.out.println(sum);

        System.out.println("Total pecentage is : "+per+"%");
    }
}
