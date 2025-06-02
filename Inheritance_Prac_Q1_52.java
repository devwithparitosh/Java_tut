//Que:-Create a class Circle and use inheritance to create another class Cylinder from it

class Circle{
    protected int radius;

    public void setRadius(int radius){
        this.radius=radius;
    }

    public double area(){
        return (Math.PI*radius*radius);
    }

}

class Cylinder extends Circle{
    public int height;

    public void setHeight(int height){
        this.height=height;
    }

    @Override
    public double area(){
        return (2*Math.PI*radius*(this.height+radius));
    }
}
public class Inheritance_Prac_Q1_52 {
    public static void main(String[] args){
        Circle a1=new Circle();
        a1.setRadius(10);
        System.out.println(a1.area());

        Cylinder c1=new Cylinder();
        c1.setHeight(15);
        c1.setRadius(10);
        System.out.println(c1.area());
    }
}
