import java.util.Random;
import java.util.Scanner;

/*
Create a class Game, which allows a user to play ['Guess the Number"
game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a User input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4, getter and setter for n00fGuesses
    Use properties such as n00fGuesses(int), etc to get this task done!
*/

class Game{
    private int GuessNumber;
    private int number;
    private int attempt=0;
    private Scanner sc;

    Game(){
        Random random=new Random();
        this.GuessNumber= random.nextInt(100)+1;
    }

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        this.number=sc.nextInt();
    }

    public boolean isCorrectNumber(){
        attempt++;
        if(GuessNumber==number){
            System.out.format("You guess the number in %d attempts and number is %d ",attempt,number);
            return true;
        }
        else if (GuessNumber>number){
            System.out.println("You Guess Too low !");
        }
        else if (GuessNumber<number) {
            System.out.println("You Guess Too High !");
        }
        return false;
    }
    public void setGuessNumber(int number){
        this.number=number;
    }
    public int getGuessNumber(){
        return number;
    }
}

public class practice_Que_50 {
    public static void main(String[] args){
        Game g=new Game();
        boolean a=false;

        while(!a){
            g.takeUserInput();
            a=g.isCorrectNumber();
            System.out.println(a);
        }
    }
}
