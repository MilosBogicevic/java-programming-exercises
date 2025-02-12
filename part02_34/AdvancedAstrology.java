package part02_34;

public class AdvancedAstrology {

	public static void main(String[] args) {
		printTriangle(4);

		System.out.println();

		christmasTree(4);

		System.out.println();

		christmasTree(10);
	}

	public static void printStars(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printSpaces(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(" ");
		}
	}

	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printSpaces(size - i);
			printStars(i);
		}
	}

	public static void christmasTree(int height) {
		for (int i = 1; i <= height; i++) {
			printSpaces(height - i);
			printStars(i + i - 1);
		}

		printSpaces(height - 2);
		printStars(3);
		printSpaces(height - 2);
		printStars(3);
	}
}
