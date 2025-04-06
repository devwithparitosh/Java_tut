public class If_Else_Logical_op_17 {
    public static void main(String[] args){
        boolean a=true;
        boolean b=true;
        boolean c=false;

        System.out.println("For Logical AND");
        if(a && b && c){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println("For Logical OR");

        if(a || b){
            System.out.println("True");
        }
        else {
            System.out.println("False");

        }

        System.out.println("For Logical NOT");

        System.out.println("For NOT a :"+ !a);

        System.out.println("For NOT c :"+ !c);


//        if(a != b){
//            System.out.println("IF Condition is True it Give False");
//        }
//        else{
//            System.out.println("True");
//        }
    }
}
