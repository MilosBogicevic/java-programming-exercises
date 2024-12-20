package part03_18;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[5];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 7;
		array[4] = 9;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println();
		System.out.println("Give two indices to swap:");
		int first = Integer.valueOf(scanner.nextLine());
		int second = Integer.valueOf(scanner.nextLine());
		System.out.println();

		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		scanner.close();
	}

}
