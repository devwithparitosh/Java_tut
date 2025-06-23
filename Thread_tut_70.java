/*----->Threads allows a program to operate more efficiently by doing multiple things at the same time.

---->Threads can be used to perform complicated tasks in the background without interrupting the main program.

---------------Creating a Thread--------------
There are two ways to create a thread.
1) It can be created by extending the Thread class and overriding its run() method:
2)Another way to create a thread is to implement the Runnable interface:*/
class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<=4000){
            System.out.println("Run the Thread 1");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=4000){
            System.out.println("Run the Thread 2");
            i++;
        }
    }
}
public class Thread_tut_70 {
    public static void main(String[] args){
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();

    }
}
