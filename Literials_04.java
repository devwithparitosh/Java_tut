//A Constant value which can be assigned to the variable is called as a literals
//literals are constant values that are directly assigned to variables. They represent fixed values that do not change during the execution of a program.
public class Literials_04 {
    public static void main(String [] args){
        byte age=24;
        short age2=321;
        int age3=2345;
        long age4=3568899876765L;   //Always perfered capital letter for long 'L' and you can use small 'l' but it's not a best practise.
        char ch='A';
        float f1=5.6f;  //Note :- If we does define the decimal value float it takes double by default as a literal.
        double d1=2.66;  //OR
        double d2=4.66d;
        boolean a = true;   //Note:- boolean by is false.
        String str="Paritosh";

        System.out.println(age);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(a);
        System.out.println(str);
    }
}
