import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		System.out.println("Enter one number");
		num1 = kb.nextDouble();
		System.out.println("Enter another number");
		num2 = kb.nextDouble();
		

		while (keepGoing) {
			System.out.print("Which would you like to do? ");
			printMenu();
			choice = kb.nextInt();

			switch (choice) {
			case 1: 
				findSum(num1, num2);
				break;
			case 2:
				findAverage(num1, num2);
				break;
			case 3:
				calcTax(num1, num2);
				break;
			case 4: 
				System.out.println("Exiting...");
				return;
				
			}
		}
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		System.out.println(sum);
		return sum;
						}
	public static double findAverage(double x, double y){
		double average = ((x + y) / 2);
		System.out.println(average);
		return average;
						}
	public static double calcTax(double x, double y ) {
		double tax = ((x +y) * 0.0831);
		tax = tax - (x + y);
		System.out.println(tax);
		return tax;
						} 
}