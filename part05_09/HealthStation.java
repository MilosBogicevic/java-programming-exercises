package part05_09;

public class HealthStation {
	public int weight(Person person) {
		return person.getWeight();
	}

	public void feed(Person person) {
		person.setWeight(weight(person) + 1);
	}
}
