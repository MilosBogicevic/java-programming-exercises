package part04_18;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<PersonalInformation> personalInformationList = new ArrayList<>();

		while (true) {
			System.out.print("First name: ");
			String firstName = scanner.nextLine();

			if (firstName.isEmpty()) {
				break;
			}

			System.out.print("Last name: ");
			String lastName = scanner.nextLine();

			System.out.print("Identification number: ");
			String identificationNumber = scanner.nextLine();

			personalInformationList.add(new PersonalInformation(firstName, lastName, identificationNumber));
		}

		for (PersonalInformation personalInfo : personalInformationList) {
			System.out.println(personalInfo.getFirstName() + " " + personalInfo.getLastName());
		}

		scanner.close();
	}

}
