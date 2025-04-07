//WAP a program to find out whether  STUDENT IS PASS or Fail , if it requires total 40% and at least 33% in each subject to pass . Assume 3 Subjects and take marks an input from the user

import java.util.Scanner;

public class PracQue_02_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Name :");
        String name=sc.nextLine();

        System.out.print("Enter the marks ");

        System.out.print("Math :");
        int m1=sc.nextInt();

        System.out.print("English :");
        int m2=sc.nextInt();

        System.out.print("Science :");
        int m3=sc.nextInt();

        System.out.print("Social Science :");
        int m4=sc.nextInt();

        System.out.print("Hindi :");
        int m5=sc.nextInt();

        float total_sum;
        float total_per;

        if(m1>33 && m2>33 && m3>33 && m4>33 && m5>33) {
            total_sum = (float)(m1 + m2 + m3 + m4 + m5);
            total_per = total_sum/5;

            System.out.println("Total marks :"+ total_sum);
            System.out.println("Total Percent :"+ total_per +"%");
        }
        else if (m1<33){
            System.out.println("Fail in Math");
        }
        else if (m2<33) {
            System.out.println("Fail in English");
        }
        else if (m3<33) {
            System.out.println("Fail in Science");
        }
        else if (m4<33){
            System.out.println("fail in Social Science");
        }
        else if (m5<33){
            System.out.println("Fail in Hindi");
        }
        else {
            System.out.println("You are not given exam in subject");
        }


    }
}
