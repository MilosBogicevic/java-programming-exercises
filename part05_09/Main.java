package part05_09;

public class Main {

	public static void main(String[] args) {
		HealthStation childrensHospital = new HealthStation();

		Person ethan = new Person("Ethan", 1, 110, 7);
		Person peter = new Person("Peter", 33, 176, 85);

		System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weight(ethan) + " kilos");
		System.out.println(peter.getName() + "'s weight: " + childrensHospital.weight(peter) + " kilos");
	}

}
