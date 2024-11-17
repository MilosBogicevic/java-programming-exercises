package part03_12;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

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

		int sum = 0;
		for (int number : numbersList) {
			sum += number;
		}

		System.out.println("Sum: " + sum);

		scanner.close();
	}

}
