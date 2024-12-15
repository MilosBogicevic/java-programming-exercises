package part05_14;

public class Book {
	private String name;
	private int publicationYear;

	public Book(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}

	public String getName() {
		return this.name;
	}

	public int getPublicationYear() {
		return this.publicationYear;
	}

	@Override
	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}

		if (compared == null || getClass() != compared.getClass()) {
			return false;
		}

		Book book = (Book) compared;

		return this.name.equals(book.name) && this.publicationYear == book.getPublicationYear();
	}
}
