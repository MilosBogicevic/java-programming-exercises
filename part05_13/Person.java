package part05_13;

import java.util.Objects;

public class Person {

	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public Person(String name, SimpleDate birthday, int height, int weight) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}

		if (compared == null) {
			return false;
		}

		if (this.getClass() != compared.getClass()) {
			return false;
		}

		Person otherPerson = (Person) compared;

		if (Objects.equals(this.name, otherPerson.name) && Objects.equals(this.birthday, otherPerson.birthday)
				&& this.height == otherPerson.height && this.weight == otherPerson.weight) {
			return true;
		}

		return false;
	}
}
