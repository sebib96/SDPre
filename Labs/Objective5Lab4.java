import java.util.Scanner;

public class Objective5Lab4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int usNum = input.nextInt();
		input.close();

		if(usNum % 2 == 0) {
			System.out.println("The number is even. ");
		}
		else if(usNum % 2 != 0) {
			System.out.println("The number is odd. ");
		}
	}
}