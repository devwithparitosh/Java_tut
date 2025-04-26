public class Varargs_33 {

    static int sum(int ...arr){                  //it takes multiple outputs in of arguments as array
        int result=0;
        for (int a=0;a<arr.length;a++){
            result +=arr[a];
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("The sum of two number : "+sum(10,20));   //passing an arguments in methods
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));
    }
}
