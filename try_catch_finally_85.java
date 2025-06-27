public class try_catch_finally_85 {
    public static int greet(){
        try {
            int a=5;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the program");
        }
        return 0;
    }
    public static void main(String[] args) {

        greet();
        int a=7;
        int b=8;

        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally value which execute any means and even if it break the loops");
            }
            b--;
        }
    }
}
