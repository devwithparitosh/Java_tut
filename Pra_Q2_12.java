//Que:-WAP to encrypt a grade by adding 8 to it .Decrypt it to show the correct grade

public class Pra_Q2_12 {
    public static void main(String[] args){
        char grade='A';

        //Encrypt
        grade=(char)(grade+8);        //typcasting has been used to convert in char
        System.out.println(grade);

        //Decrypt
        grade=(char)(grade-8);
        System.out.println(grade);

    }
}
