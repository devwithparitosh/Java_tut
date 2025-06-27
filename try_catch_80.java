public class try_catch_80 {
    public static void main(String[] args){
        int a=6000;
        int b=0;
        int c;
////        without Try
//        c=a / b;
//        System.out.println("The result is "+c);
////        with try
        try {
            c=a / b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.print("We failed to divide . Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the Program ");
    }
}
