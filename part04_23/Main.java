package part04_23;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(Paths.get("src/part04_23/file.txt"))) {
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				System.out.println(row);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
