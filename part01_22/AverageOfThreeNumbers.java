package part01_22;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give the first number:");
		int firstNumber = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give the second number:");
		int secondNumber = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Give the third number:");
		int thirdNumber = Integer.valueOf(scanner.nextLine());
		
		int sum = firstNumber + secondNumber + thirdNumber;
		double average = (double) sum / 3.0;
		
		System.out.println("The average is " + average);
		
		scanner.close();
	}

}
