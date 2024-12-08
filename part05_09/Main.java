package part05_09;

public class Main {

	public static void main(String[] args) {
		HealthStation childrensHospital = new HealthStation();

		Person ethan = new Person("Ethan", 1, 110, 7);
		Person peter = new Person("Peter", 33, 176, 85);

		System.out.println(ethan.getName() + " weight: " + childrensHospital.weight(ethan) + " kilos");
		System.out.println(peter.getName() + " weight: " + childrensHospital.weight(peter) + " kilos");

		childrensHospital.feed(ethan);
		childrensHospital.feed(ethan);
		childrensHospital.feed(ethan);

		System.out.println("");

		System.out.println(ethan.getName() + " weight: " + childrensHospital.weight(ethan) + " kilos");
		System.out.println(peter.getName() + " weight: " + childrensHospital.weight(peter) + " kilos");
	}

}
