
class myNewThr extends Thread{
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("I am a thread class "+Thread.currentThread().getName());
            i++;
        }
    }
}

public class Thread_Methods_75 {
    public static void main(String[] args){
        myNewThr t1=new myNewThr();
        myNewThr t2=new myNewThr();

        t1.setName("larry");
        t2.setName("Honey");

        t1.start();
        try{                         //in this block code will block the t2 thread at the run time of t1
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
