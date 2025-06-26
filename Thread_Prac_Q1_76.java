//Q1:-WAP to print "good morning " and "welcome" continuously on the screen in java using Threads

class greet extends Thread{
    public greet(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println(Thread.currentThread().getName());
            i++;
        }
    }
}
public class Thread_Prac_Q1_76 {
    public static void main(String[] args){
        greet t1=new greet("Good morning");
        greet t2=new greet("Welcome");

        t1.start();
        t2.start();
    }
}
