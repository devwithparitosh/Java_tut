
class Thread1 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=100;i++ ){
            System.out.println("Thread1 is running using Runnable interface");
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("Thread2 is running");
        }
    }
}

public class Thread_runnable_71 {
    public static void main(String[] args){

        /*
        Creates an object (bullet) of class Thread1.
        If Thread1 extends Thread:
        bullet is itself a thread (call bullet.start() directly).
        If Thread1 implements Runnable:
        bullet is a task (needs a Thread to run it).
        */

        Thread1 bullet=new Thread1();
        Thread gun=new Thread(bullet);                //First way to create a object of Thread1 And it doesn't call the


        Thread gun2=new Thread(new Thread2());        //second way and fasted way

//        This tells the thread what code it should execute when started (the run() method of the Runnable

        gun.start();
        gun2.start();
    }
}
