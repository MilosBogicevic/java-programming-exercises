package part03_28;

import java.util.Scanner;

public class FirstWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String text = scanner.nextLine();

			if (text.isEmpty()) {
				break;
			}

			String[] words = text.split("\\s+");
			System.out.println(words[0]);
		}

		scanner.close();
	}

}
