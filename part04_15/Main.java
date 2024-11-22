package part04_15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Statistics allNumbers = new Statistics();
		Statistics oddNumbers = new Statistics();
		Statistics evenNumbers = new Statistics();

		System.out.println("Enter numbers: ");
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());

			if (number == -1) {
				break;
			}

			if (number % 2 == 0) {
				evenNumbers.addNumber(number);
			} else {
				oddNumbers.addNumber(number);
			}

			allNumbers.addNumber(number);
		}

		System.out.println("Sum: " + allNumbers.sum());
		System.out.println("Sum of odd numbers: " + oddNumbers.sum());
		System.out.println("Sum of even numbers: " + evenNumbers.sum());

		scanner.close();
	}

}
