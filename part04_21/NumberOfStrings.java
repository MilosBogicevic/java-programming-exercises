package part04_21;

import java.util.Scanner;

public class NumberOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		while (true) {
			String word = scanner.nextLine().trim();

			if (word.equals("end")) {
				break;
			}

			if (!word.isEmpty()) {
				count++;
			}
		}

		System.out.println(count);

		scanner.close();
	}

}
