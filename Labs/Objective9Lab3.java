import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while(true){
      printMenu();
      selection = scanner.nextInt();
      switch (selection) {
      case 1:
        System.out.println("Hi!");
        break;
      case 2:
        System.out.println("Steak, octopus, pineapple");
        break;
      case 3:
        System.out.println("Exit");
        return;
      }
    }

    

  } 

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
