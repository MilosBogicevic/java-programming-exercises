package part05_11;

public class Main {

	public static void main(String[] args) {
		Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
		Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
		Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

		System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt)); // false
		System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt)); // true
	}

}
