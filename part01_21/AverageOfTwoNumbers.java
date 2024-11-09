package part01_21;
import java.util.Scanner;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int firstNumber = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give the second number:");
		int secondNumber = Integer.valueOf(scanner.nextLine());
		
		int sum = firstNumber + secondNumber;
		double average = (double) sum / 2.0;
		
		System.out.println("The average is " + average);
		
		scanner.close();
	}

}
