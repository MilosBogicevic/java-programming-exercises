package part03_14;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> namesList = new ArrayList<>();
		while (true) {
			String name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}

			namesList.add(name);

		}

		System.out.println("Search for? ");
		String searchFor = scanner.nextLine();

		if (namesList.contains(searchFor)) {
			System.out.println(searchFor + " was found!");
		} else {
			System.out.println(searchFor + " was not found!");
		}

		scanner.close();
	}

}
