import java.util.Scanner;

public class Switch_Case_18  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age :");
        int age=sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are an Adult");
                break;
            case 30:
                System.out.println("Your Became a Grown Up");
                break;
            case 50:
                System.out.println("You are in your 50's");
                break;
            case 70:
                System.out.println("You are became old");
                break;
            default:
                System.out.println("Enjoy Your Life");
        }
    }
}
