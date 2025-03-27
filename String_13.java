/*-->A String in Java is a sequence of characters, represented as an object of the String class.
    Java provides the String class to handle and manipulate text efficiently.
    --->String are immutable.

 -->Strings can be created in two ways:
    1)Using String Literals (Stored in the String Pool):
    String str1 = "Hello, Java!";

    >When a string is created using double quotes (""),Java automatically stores it in the string pool for memory optimization.

    2)Using the new Keyword (Stored in Heap Memory):
    String str2 = new String("Hello, Java!");

    >This creates a new String object in heap memory, even if the same string exists in the pool.
*/

import java.util.Scanner;

public class String_13 {
    public static void main(String[] args) {
        String name="Diablo";
        System.out.print("Villan name is : ");     //Another Way of Print the Value
        System.out.println(name);

        int a=6;
        float b =5.879f;
        System.out.printf("The value of a is %d and value of b is %f \n",a,b);
        System.out.format("The value is a : %d and b :%f \n",a,b);

        System.out.printf("The value of a is %d and value of b is %8.2f \n",a,b); //Decimal spacing

        //Another Way Creating String
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
//        String str=sc.next();  //It's only read the Single Word
//        System.out.println("Entered string is : "+str);

        String str2=sc.nextLine();  //It Reads the whole Line as a input
        System.out.println("Entered string is : "+str2);

    }
}
