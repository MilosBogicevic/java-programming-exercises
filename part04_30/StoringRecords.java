package part04_30;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Filename:");
		String fileName = scanner.nextLine();

		ArrayList<Person> records = readRecordsFromFile(fileName);
		System.out.println("Persons: " + records.size());
		System.out.println("Persons:");

		for (Person person : records) {
			System.out.println(person);
		}
	}

	public static ArrayList<Person> readRecordsFromFile(String fileName) {
		ArrayList<Person> persons = new ArrayList<>();

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_30/" + fileName))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] parts = line.split(",");

				String name = parts[0];
				int age = Integer.valueOf(parts[1]);
				persons.add(new Person(name, age));
			}

		} catch (Exception e) {
			System.out.println("File not found.");
		}

		return persons;
	}
}
