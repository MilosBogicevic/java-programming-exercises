package part03_26;

import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();
		String[] words = text.split("\\s+");

		for (String word : words) {
			System.out.println(word);
		}

		scanner.close();
	}

}
