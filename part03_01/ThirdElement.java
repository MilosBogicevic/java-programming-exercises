package part03_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();
		while (true) {
			String names = scanner.nextLine();

			if (names.isEmpty()) {
				break;
			}

			list.add(names);
		}

		System.out.println(list.get(2));

		scanner.close();
	}

}
