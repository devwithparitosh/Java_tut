/*Que3:-Calculate income tax paid by an employee ot the goverment as 0per ther slabs mentioned below
    income slab      Tax
    2.3l-5.0l        5%
    5.0l-10.0l       20%
    above 10.0l      30%

    Note that is no tax below 2.5l . take input amount as an input friom the user .
*/



import java.util.Scanner;

public class PracQue_03_19 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Your Name :");
        String name=sc.nextLine();

        System.out.print("Enter your Annual Income :");
        double annunalAmount=sc.nextDouble();

        double tax;
        double taxAmount;

        if(annunalAmount< 250000){
            System.out.println("Their is no Tax on Below 2.5l ");
        }
        else if (annunalAmount>250000 && annunalAmount<=500000) {
            System.out.println("Their is 5% tax on Between 2.5l and 5.0l");
            tax =0.05;
            taxAmount =tax*annunalAmount;
            annunalAmount -=taxAmount;
            System.out.println(name+"Your tax amount is "+taxAmount+" Remaining Salary is "+annunalAmount);
        }
        else if (annunalAmount>500000 && annunalAmount<=1000000){
            System.out.println("Their is 20% tax of 5.0l and 10.0l");
            tax=0.2;
            taxAmount =tax*annunalAmount;
            annunalAmount -=taxAmount;
            System.out.println(name+" Your tax amount is "+taxAmount+" Remaining salary is "+annunalAmount);
        }
        else if (annunalAmount>1000000){
            System.out.println("Thier is 30% tax on above 10.0l");
            tax=0.3;
            taxAmount =tax*annunalAmount;
            annunalAmount -=taxAmount;
            System.out.println(name+" Your tax amount is "+taxAmount+" Remaining salary is "+annunalAmount);
        }
        else {
            System.out.println("N/A");
        }
    }
}
