package part05_09;

public class HealthStation {

	private int weighingsCount = 0;

	public int weight(Person person) {
		weighingsCount++;
		return person.getWeight();
	}
	
	public int weighings() {
		return this.weighingsCount;
	}

	public void feed(Person person) {
		person.setWeight(weight(person) + 1);
	}
}
