package part03_30;

import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int oldest = 0;
		while (true) {
			String text = scanner.nextLine();

			if (text.isEmpty()) {
				break;
			}

			String[] words = text.split(",");
			int age = Integer.valueOf(words[1]);
			if (oldest < age) {
				oldest = age;
			}
		}

		System.out.println("Age of the oldest: " + oldest);

		scanner.close();
	}

}
