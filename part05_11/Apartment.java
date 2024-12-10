package part05_11;

public class Apartment {
	private int rooms;
	private int squares;
	private int pricePerSquare;

	public Apartment(int rooms, int squares, int pricePerSquare) {
		this.rooms = rooms;
		this.squares = squares;
		this.pricePerSquare = pricePerSquare;
	}

	public boolean largerThan(Apartment compared) {
		if (this.squares >= compared.squares) {
			return true;
		} else {
			return false;
		}
	}
}
