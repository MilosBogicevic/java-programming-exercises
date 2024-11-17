package part03_10;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numbersList = new ArrayList<>();
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());

			if (number == -1) {
				break;
			}

			numbersList.add(number);
		}

		System.out.println("Search for? ");
		int searchedNum = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < numbersList.size(); i++) {
			if (searchedNum == numbersList.get(i)) {
				System.out.println(searchedNum + " is at index " + i);
			}
		}

		scanner.close();
	}

}
