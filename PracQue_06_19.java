import java.util.Scanner;

/*Que6:-WAp a program to find out the type of website from the url
.com-->Commercial website
.org-->organization website
.in-->indian website
*/
public class PracQue_06_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Website url :");
        String website= sc.nextLine();

        boolean com= website.endsWith(".com");
        boolean org=website.endsWith(".org");
        boolean in=website.endsWith(".in");

        if (com){
            System.out.println("It's a Commercial webite");
        } else if (org) {
            System.out.println("It's a organization website");
        } else if (in) {
            System.out.println("It's a indian website");
        } else {
            System.out.println("It's a Private Website");
        }

    }
}
