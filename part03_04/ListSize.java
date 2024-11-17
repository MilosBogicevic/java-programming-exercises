package part03_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

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

		System.out.println("In total: " + namesList.size());

		scanner.close();
	}

}
