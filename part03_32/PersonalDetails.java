package part03_32;

import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String longestName = "";
		int sum = 0;
		int count = 0;

		while (true) {
			String input = scanner.nextLine();

			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(",");
			String name = parts[0].trim();
			int birthYear = Integer.valueOf(parts[1].trim());

			if (longestName.length() < name.length()) {
				longestName = name;
			}

			sum += birthYear;
			count++;

		}

		double average = (double) sum / count;

		System.out.println("Longest name: " + longestName);
		System.out.println("Average of the birth years: " + average);

		scanner.close();
	}

}
