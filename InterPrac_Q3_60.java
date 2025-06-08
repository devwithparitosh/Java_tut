//Q3:-Create a Class Monkey with jump() and bite() methods . Create a class Human which inherit the this monkey class and implement BasicAnimal interface with the eat() and sleep methods
//Q5:-Demonstrate the polymorphism.

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Jumps");
    }
    public void bite(){
        System.out.println("Take a bite of Apple");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating the food");
    }
    public void sleep(){
        System.out.println("Sleep's in the bed");
    }
}
public class InterPrac_Q3_60 {
    public static void main(String[] args){
        Human h=new Human();

        h.jump();      //polymorphism
        h.bite();
        h.eat();
    }
}
