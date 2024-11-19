package part03_22;

public class PrintInStars {

	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 4, 2 };
		printArrayInStars(array);
	}

	public static void printArrayInStars(int[] array) {
		for (int stars : array) {
			printStars(stars);
			System.out.println();
		}
	}

	public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
	}
}
