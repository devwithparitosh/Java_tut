
class CellPhone{
    public void Ring(){
        System.out.println("Ringing....");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
}
public class MethPrac_Q2_39 {
    public static void main(String[] args){
        CellPhone phone=new CellPhone();

        phone.Ring();
        phone.Vibrate();
    }
}
