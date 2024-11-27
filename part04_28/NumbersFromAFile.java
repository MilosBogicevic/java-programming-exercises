package part04_28;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File? ");
		String fileName = scanner.nextLine();

		System.out.print("Lower bound? ");
		int lowerBound = Integer.valueOf(scanner.nextLine());

		System.out.print("Upper bound? ");
		int upperBound = Integer.valueOf(scanner.nextLine());

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_28/" + fileName))) {
			int count = 0;

			while (fileReader.hasNextLine()) {
				int number = Integer.valueOf(fileReader.nextLine());

				if (number >= lowerBound && number <= upperBound) {
					count++;
				}
			}

			System.out.println("Numbers: " + count);
		} catch (Exception e) {
			System.out.println("File not found.");
		}

		scanner.close();
	}

}
