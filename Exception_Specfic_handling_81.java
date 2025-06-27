import java.util.Scanner;

public class Exception_Specfic_handling_81 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int subject=sc.nextInt();

        int []marks=new int[subject];

        for (int i=0;i<=marks.length-1;i++){
            marks[i]=sc.nextInt();
        }

        System.out.println("Enter the marks index you want :");
        int id=sc.nextInt();

        System.out.println("Enter the number you want to divide the marks :");
        int num= sc.nextInt();

        try {
            System.out.printf("You select the index %d and number is %d \n",id ,num);
            System.out.println("and answer is :"+marks[id]/num);
        }
        catch (Exception e){
            System.out.print("Some Error is occurred! Reason : ");
            System.out.println(e);
        }
    }
}
