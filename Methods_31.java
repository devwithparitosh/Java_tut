//void means that this method does not have a return value. You will learn more about return values later in this chapter

//static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.

//There are two types of methods in Java:

//Predefined Method-->equals(),sqrt().compareTo(),max(){Math Class}
//User-defined Method

public class Methods_31 {
    static int sum(int a,int b){          //Static method calls in static
        return a+b;
    }
    public static void main(String[] args){
        int x=10;
        int y=15;

        int z=sum(x,y);      //1st way to call method
        System.out.println("Sum of two number : "+z);

        Methods_31 s=new Methods_31();      //2nd way to call method
        System.out.println(s.sum(1,2));
    }
}
