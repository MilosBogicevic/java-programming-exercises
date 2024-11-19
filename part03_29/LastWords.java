package part03_29;

import java.util.Scanner;

public class LastWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String text = scanner.nextLine();

			if (text.isEmpty()) {
				break;
			}

			String[] words = text.split("\\s+");
			System.out.println(words[words.length - 1]);
		}

		scanner.close();
	}

}
