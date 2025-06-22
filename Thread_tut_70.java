
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
