package part01_33;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String password = "Caput Draconis";

		System.out.println("Password?");
		String input = scanner.nextLine();

		if (password.equals(input)) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Off with you!");
		}

		scanner.close();
	}

}
