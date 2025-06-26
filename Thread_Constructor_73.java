
class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<=1000;i++){
            System.out.println("I'm the Thread 1");
        }
    }
}

public class Thread_Constructor_73 {
    public static void main(String[] args){
        myThr t1=new myThr("leo");
        t1.start();

        System.out.println("Id of the Thread is "+t1.getId());
        System.out.println("NAme of the Thread is "+t1.getName());
    }
}
