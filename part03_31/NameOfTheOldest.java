package part03_31;

import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int oldest = 0;
		String name = "";

		while (true) {
			String input = scanner.nextLine();

			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(",");
			int age = Integer.valueOf(parts[1]);
			if (oldest < age) {
				oldest = age;
				name = parts[0];
			}
		}

		System.out.println("Name of the oldest: " + name);

		scanner.close();
	}

}
