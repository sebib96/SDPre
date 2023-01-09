import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = input.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = input.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = input.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    double dub1 = input.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    double dub2 = input.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    double dub3 = input.nextDouble();


    System.out.println("The sum of " +num1+ " + " +num2+ " + " +num3+ " = " +(num1 + num2 + num3));
    System.out.println("The sum of " +dub1+ " + " +dub2+ " + " +dub3+ " = " +(dub1 + dub2 + dub3));
    



    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
