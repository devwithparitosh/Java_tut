
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
