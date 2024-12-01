package part05_03;

public class Main {

	public static void main(String[] args) {

		Cube cubeOne = new Cube(4);
		System.out.println(cubeOne.volume());
		System.out.println(cubeOne);

		Cube cubeTwo = new Cube(2);
		System.out.println(cubeTwo.volume());
		System.out.println(cubeTwo);
	}

}
