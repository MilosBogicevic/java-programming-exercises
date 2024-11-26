package part04_26;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		Boolean fileLoaded = false;

		System.out.println("Name of the file:");
		String fileName = scanner.nextLine();

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_26/" + fileName))) {
			while (fileReader.hasNextLine()) {
				names.add(fileReader.nextLine());
			}
			fileLoaded = true;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		if (fileLoaded) {
			System.out.println("Enter names, an empty line quits.");
			while (true) {
				String name = scanner.nextLine();

				if (name.isEmpty()) {
					break;
				}

				if (names.contains(name)) {
					System.out.println("The name is on the list.");
				} else {
					System.out.println("The name is not on the list.");
				}
			}

		} else {
			System.out.println("File not found.");
		}
		System.out.println("Thank you!");
	}

}
