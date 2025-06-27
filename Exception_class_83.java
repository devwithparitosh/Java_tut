import java.util.Scanner;

/*
So, We can create the custom Exception using Exception class in java

class MyException extends Exception{
      overrideng methods
 }
 */
class MyException extends Exception{

    @Override
    public String toString(){                          //excuted when sout (e) ran
        return super.toString()+ " I am toString() ";
    }

    @Override
    public String getMessage() {                        //prints the exception message
        return super.getMessage() +" I am getMessage()";
    }

}
public class Exception_class_83 {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();

        if (a<99){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());

                System.out.println(e);

                e.printStackTrace();              //prints stack trace
                System.out.println("Finished");
            }
            System.out.println("YEs Finally Finished");
        }
    }
}
