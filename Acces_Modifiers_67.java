class AnimalClass{

    private String animalName="Dogo";
    protected int age=5;
    String color="Black";
    public String animalSpecies="Dog";

    public void name(){
        System.out.println("Name of the animal is :"+animalName);
        System.out.println("Species of the animal is :"+animalSpecies);
        System.out.println("Age of the animal is :"+age);
        System.out.println("Color of the animal is :"+color);
    }
}

public class Acces_Modifiers_67 {
    public static void main(String[] args){

        AnimalClass cat=new AnimalClass();
        cat.name();
        System.out.println(cat.age);
        System.out.println(cat.animalSpecies);
        System.out.println(cat.color);
//        System.out.println(cat.animalName);              //Can't be able to acess because it is private
    }
}
