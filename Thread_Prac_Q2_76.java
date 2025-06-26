//Q4:How to get the state of a given thread in java.
//Q5:-How do you get reference to the current Thread in java?

class statePos extends Thread {
    public statePos(String name){
        super(name);
    }
    int i=0;
    public void run(){
        while(i<=1000){
            System.out.println("Hi! my name is "+Thread.currentThread().getName());
            i++;
        }
    }
}
public class Thread_Prac_Q2_76 {
    public static void main(String[] args){
        statePos t1=new statePos("larry");
        statePos t2=new statePos("honey");


        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println(Thread.currentThread().getState());
    }
}
