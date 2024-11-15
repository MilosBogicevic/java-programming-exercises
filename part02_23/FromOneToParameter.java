package part02_23;

import java.util.Scanner;

public class FromOneToParameter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.valueOf(scanner.nextLine());
		printUntilNumber(number);

		scanner.close();
	}

	public static void printUntilNumber(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
}
