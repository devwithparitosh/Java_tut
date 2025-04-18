public class DoWhileLoop_22 {
    public static void main(String[] args){
        int a=10;
        while(a<=5){
            System.out.println(a);
            a++;
        }
        System.out.println("Terminated in while loop");

        do {
            System.out.println(a);
            a++;
        }while (a<=5);
        System.out.println("It,s run at least one time , if condition is false in do while loop");
    }
}
