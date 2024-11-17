package part03_13;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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

		double average = (double) sum / numbersList.size();
		System.out.println("Average: " + average);

		scanner.close();
	}

}
