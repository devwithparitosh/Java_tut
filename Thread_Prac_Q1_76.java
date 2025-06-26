//Q1:-WAP to print "good morning " and "welcome" continuously on the screen in java using Threads
//Q2:-Add a sleep method in welcome thread of que2 to delay the its excution for 200ms
//Q3:-WAP a program to use of setPriority() and getPriority() of the thread

class greet extends Thread{
    public greet(String name){
        super(name);
    }
    public void run(){
        if(this.getName().equals("Welcome")){
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        int i=0;
        while(i<=10000){
            System.out.println(Thread.currentThread().getName());
            i++;
        }
    }
}
public class Thread_Prac_Q1_76 {
    public static void main(String[] args){
        greet t1=new greet("Good morning");
        greet t2=new greet("Welcome");

        t1.setPriority(5);
        t1.start();

        t2.setPriority(10);
        t2.start();

        System.out.println("Welcome Priority is :- "+t2.getPriority());

    }
}
