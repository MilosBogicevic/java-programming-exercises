package part03_27;

import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String text = scanner.nextLine();

			if (text.isEmpty()) {
				break;
			}

			String[] words = text.split("\\s+");

			for (String word : words) {
				if (word.contains("av")) {
					System.out.println(word);
				}
			}
		}

		scanner.close();
	}

}