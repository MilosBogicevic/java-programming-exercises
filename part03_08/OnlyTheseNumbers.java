package part03_08;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

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

		System.out.println("From where? ");
		int start = Integer.valueOf(scanner.nextLine());

		System.out.println("To where? ");
		int end = Integer.valueOf(scanner.nextLine());

		for (int i = start; i <= end; i++) {
			System.out.println(numbersList.get(i));
		}

		scanner.close();
	}

}
