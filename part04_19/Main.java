package part04_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<TelevisionProgram> programsList = new ArrayList<>();

		while (true) {
			System.out.print("Name: ");
			String name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}

			System.out.print("Duration: ");
			int duration = Integer.valueOf(scanner.nextLine());

			programsList.add(new TelevisionProgram(name, duration));
		}

		System.out.print("Program's maximum duration? ");
		int maximumDuration = Integer.valueOf(scanner.nextLine());

		for (TelevisionProgram item : programsList) {
			if (item.getDuration() <= maximumDuration) {
				System.out.println(item);
			}
		}

		scanner.close();
	}

}
