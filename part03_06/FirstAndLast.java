package part03_06;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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

		System.out.println(namesList.get(0));
		System.out.println(namesList.get(namesList.size() - 1));

		scanner.close();
	}

}
