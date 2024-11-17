package part03_07;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

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

		for (int i = 0; i < numbersList.size(); i++) {
			System.out.println(numbersList.get(i));
		}

		scanner.close();
	}

}
