
class Square{
    public int area(int side){
        return side*side;
    }
    public int perimeter(int side){
        return 4*side;
    }
}
public class MethPrac_Q3_39 {
    public static void main(String[] args) {
        Square shape=new Square();

        System.out.println("The area of Square is "+shape.area(4));
        System.out.println("the perimeter of Square is "+shape.perimeter(2));
    }
}
