import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.println("What is your first name?");
    String first = keyboard.nextLine();
    System.out.println("What is your last name?");
    String last = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String animal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String food = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String song = keyboard.nextLine();

    System.out.println("My name is " + first + " " + last);
    System.out.println("My favorite animal is the " + animal);
    System.out.println("My favorite food is " + food);
    System.out.println("My favorite song is " + song);
    



    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}