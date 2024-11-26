package part04_27;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String fileName = scanner.nextLine();

		System.out.println("Search for:");
		String searchedFor = scanner.nextLine();

		boolean found = false;

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_27/" + fileName))) {
			while (fileReader.hasNextLine()) {
				String name = fileReader.nextLine();
				if (name.contains(searchedFor)) {
					System.out.println("Found!");
					found = true;
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Reading the file " + fileName + " failed.");
			return;
		} finally {
			scanner.close();
		}

		if (!found) {
			System.out.println("Not found.");
		}
	}

}
