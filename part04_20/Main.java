package part04_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();

		while (true) {
			System.out.print("Title: ");
			String title = scanner.nextLine();

			if (title.isEmpty()) {
				break;
			}

			System.out.print("Pages: ");
			int pages = Integer.valueOf(scanner.nextLine());

			System.out.print("Publication year: ");
			int publicationYear = Integer.valueOf(scanner.nextLine());

			books.add(new Book(title, pages, publicationYear));
		}

		System.out.print("What information will be printed? ");
		String info = scanner.nextLine();

		for (Book book : books) {
			if (info.equals("name")) {
				System.out.println(book.getTitle());
			} else {
				System.out.println(book);
			}
		}

		scanner.close();
	}

}
