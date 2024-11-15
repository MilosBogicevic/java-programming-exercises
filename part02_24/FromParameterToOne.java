package part02_24;

import java.util.Scanner;

public class FromParameterToOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.valueOf(scanner.nextLine());
		printUntilNumber(number);

		scanner.close();
	}

	public static void printUntilNumber(int number) {
		for (int i = number; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
