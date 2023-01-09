
import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int usNum = input.nextInt();
      input.close();

      if(usNum < 0) {
        System.out.println("The number is negative");
      }
       else if(usNum == 0) {
        System.out.println("The number is 0");
      }
      else if(usNum > 0) {
        System.out.println("The number is positive");
      }
  }
}