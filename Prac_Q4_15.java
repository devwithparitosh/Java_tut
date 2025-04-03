//Q:-WAP  ajava program to detect double space and triple space in a string

public class Prac_Q4_15 {
    public static void main(String[] args){
         String para="You are  the Shadow   Monarch of the Shadow  Army";

         System.out.println("Double Spaces :"+para.indexOf("  "));
         System.out.println("Triple Spaces :"+para.indexOf("   "));
    }
}
