//Array is a collection of similar types of data
//Syntax:  datatypes[] ArrayName

public class Array_26 {
    public static void main(String[] args){

        //1st Way
        int []marks =new int[5];    //Declaration + Memory allocation
        // reference = object

        marks[0]=100;
        marks[1]=200;
        marks[2]=300;
        marks[3]=400;
        marks[4]=500;

        //2nd Way
        int []num;         //Declaration
        num=new int[5];     //Memory Allocation

        //3rd Way
        int []num1={10,20,30,40,50};     //Declare + initialize

        System.out.println(marks[3]);   //Accessing an array
    }
}
