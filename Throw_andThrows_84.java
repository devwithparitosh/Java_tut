/*
----The throw keyword is used to create a custom error.-----------
------The throw statement is used together with an exception type.
------There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

--------------------The throws keyword indicates what exception type may be thrown by a method.----------

-----There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
*/

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be Negative";
    }

    @Override
    public String getMessage(){
        return "Radius can't be Negative";
    }
}
public class Throw_andThrows_84 {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }

        double result=Math.PI*r*r;
        return result;
    }

    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }

    public static void main(String[] args) {

        try {
//            int c= divide(6,0);
//            System.out.println(c);

            double ar=area(-8);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
