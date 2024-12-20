package part03_30;

import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int oldest = 0;
		while (true) {
			String input = scanner.nextLine();

			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(",");
			int age = Integer.valueOf(parts[1]);
			if (oldest < age) {
				oldest = age;
			}
		}

		System.out.println("Age of the oldest: " + oldest);

		scanner.close();
	}

}
