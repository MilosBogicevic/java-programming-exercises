package part04_29;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String filePath = scanner.nextLine();

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_29/" + filePath))) {
			while (fileReader.hasNextLine()) {
				String record = fileReader.nextLine();
				String[] parts = record.split(",");

				String name = parts[0];
				int age = Integer.valueOf(parts[1]);

				if (age == 1) {
					System.out.println(name + ", age: " + age + " year");
				} else {
					System.out.println(name + ", age: " + age + " years");
				}
			}
		} catch (Exception e) {
			System.out.println("File not found.");
		}
	}

}
