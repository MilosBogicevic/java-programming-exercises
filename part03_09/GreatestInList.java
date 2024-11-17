package part03_09;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

		int greatest = numbersList.get(0);
		for (int i = 1; i < numbersList.size(); i++) {
			if (greatest < numbersList.get(i)) {
				greatest = numbersList.get(i);
			}
		}

		System.out.println("The greatest number: " + greatest);

		scanner.close();
	}

}
