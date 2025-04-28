import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        for (int i=0;i<=num;i++){
            for (int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
