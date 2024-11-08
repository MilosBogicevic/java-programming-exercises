package part01_14;

import java.util.Scanner;

public class BooleanInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write something:");
		boolean booleanInput = Boolean.valueOf(scanner.nextLine());
		
		System.out.println("True or false? " + booleanInput);
		
		scanner.close();
	}

}
