package part04_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<>();

		while (true) {
			System.out.print("Name: ");
			String name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}

			items.add(new Item(name));
		}

		for (Item item : items) {
			System.out.println(item);
		}

		scanner.close();
	}

}
