

public class Precdence_assositivity_09 {
    public static void main(String[] args){
        int a=6*5-34/2;
/*        Precedence :-in precedence we look for the high precedence operator
          =30-34/2
          =30-17
          =13                  */
        System.out.println(a);

//        Associative  :- in this term we look for left to right associativity of the operator in case of precedence unable to apply
        int b=60/5-34*2;
//        =12-34*2
//        =12-68
//        =-56
        System.out.println(b);
    }
}
