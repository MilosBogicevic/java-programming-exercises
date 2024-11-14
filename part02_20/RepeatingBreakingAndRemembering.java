package part02_20;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		int oddNumbers = 0;
		int evenNumbers = 0;

		System.out.println("Give numbers:");
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());

			if (number == -1) {
				System.out.println("Tnx! Bye!");
				break;
			}

			sum += number;
			count++;

			if (number % 2 == 0) {
				evenNumbers++;
			} else {
				oddNumbers++;
			}
		}

		double average = (double) sum / count;
		System.out.println("Sum: " + sum);
		System.out.println("Numbers: " + count);
		System.out.println("Average: " + average);
		System.out.println("Odd: " + oddNumbers);
		System.out.println("Even: " + evenNumbers);

		scanner.close();
	}

}
