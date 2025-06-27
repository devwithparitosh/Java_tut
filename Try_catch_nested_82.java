import java.util.Scanner;

public class Try_catch_nested_82 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []marks=new int[3];

        for (int i=0;i<=marks.length-1;i++){
            marks[i]=sc.nextInt();
        }
        boolean flag=true;

        while(flag){

            System.out.println("Enter the marks index you want :");
            int id=sc.nextInt();

            try {

                System.out.println("and answer is :"+marks[id]);

                try {

                    System.out.println(marks[4]);
                    flag=false;

                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println("Exception in Level 1!");
                    System.out.println("Sorry this index is Available");

                }

                System.out.println("Enter the number you want to divide the marks :");
                int num= sc.nextInt();

                System.out.printf("You select the index %d and number is %d \n",id ,num);
                System.out.println("and answer is :"+marks[id]/num);

            }
            catch (Exception e){

                System.out.println("Exception in Level 1!");
                System.out.println(e);

            }
            System.out.println("Thank you");
        }
    }
}
