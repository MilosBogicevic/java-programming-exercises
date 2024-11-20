package part04_03;

public class Dog {

	private String name;
	private String breed;
	private int age;

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	@Override
	public String toString() {
		return (breed + " named " + name + " is " + age + " years old.");
	}
}
