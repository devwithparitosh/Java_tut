public class ForLoop_23 {
    public static void main(String[] args){
        for (int i=0; i<=10;i++){
            System.out.println(i);
        }

//        Que:- Write a program of java to print odd number using for loop upto 50
        for (int a=1; a<=50;a++){

            if (a%2!=0){
                System.out.println(" Odd numbers :"+a);
            }
        }
//        Que:- Write a program to print first n number natural number s in reverse
        int n=10;
        for (int j=n;j>0;j--){
            System.out.println(j);
        }
    }
}
