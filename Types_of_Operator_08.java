
public class Types_of_Operator_08 {
    public static void main(String[] args){
//        Arthmethic operator
        int a=20,b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++a);
        System.out.println(--a);

//        Assignment operator  =, +=
        int c=a+b;
        System.out.println(c);
        c+=2;
        System.out.println(c);

//        Comparision operator
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);

//        Logical operator
        System.out.println(a>b && b>c);
        System.out.println(a>b || b>c);
        System.out.println(a!=b);

//        Bitwise Operator
        System.out.println(2&3);
        System.out.println(2&3);
    }
}
