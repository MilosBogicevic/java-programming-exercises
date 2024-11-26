package part04_25;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Which file should have its contents printed?");
			String fileName = scanner.nextLine();

			try (Scanner fileReader = new Scanner(Paths.get("src/part04_25/" + fileName))) {
				while (fileReader.hasNextLine()) {
					System.out.println(fileReader.nextLine());
				}

			} catch (Exception e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
