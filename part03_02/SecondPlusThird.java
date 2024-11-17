package part03_02;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numbersList = new ArrayList<>();
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				break;
			}

			numbersList.add(number);
		}

		System.out.println(numbersList.get(1) + numbersList.get(2));

		scanner.close();
	}

}
