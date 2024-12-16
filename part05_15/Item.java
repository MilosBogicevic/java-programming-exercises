package part05_15;

import java.util.Objects;

public class Item {
	private String identifier;
	private String name;

	public Item(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
	}

	@Override
	public boolean equals(Object compare) {
		if (this == compare) {
			return true;
		}

		if (compare == null || getClass() != compare.getClass()) {
			return false;
		}

		Item item = (Item) compare;

		return Objects.equals(this.identifier, item.identifier);
	}

	@Override
	public String toString() {
		return this.identifier + ": " + this.name;
	}
}
