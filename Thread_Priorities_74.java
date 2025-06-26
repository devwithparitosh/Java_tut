
class myTh extends Thread{
    myTh(String name){
        super(name);
    }
    int i;
    public void run(){
        while(i<=1000){
            System.out.println("Thread name is "+this.getName());
            i++;
        }
    }
}
public class Thread_Priorities_74 {
    public static void main(String[] args){
        myTh t1=new myTh("Guru");
        myTh t2=new myTh("Leo");
        myTh t3=new myTh("Honey");
        myTh t4=new myTh("larry");
        myTh t5=new myTh("Willy");

        t1.setPriority(Thread.MAX_PRIORITY);            //Setting the Priority of the Thread MAX
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
