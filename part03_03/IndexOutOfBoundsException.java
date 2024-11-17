package part03_03;

import java.util.ArrayList;

public class IndexOutOfBoundsException {

	public static void main(String[] args) {
		// The purpose of this exercise is to cause an IndexOutOfBoundsException
		ArrayList<String> lines = new ArrayList<>();
		lines.add("Index 0");
		lines.add("Index 1");
		lines.add("Index 2");
		lines.add("Index 3");
		lines.add("Index 4");
		lines.add("Index 5");

		for (String line : lines) {
			System.out.println(line);
		}

		System.out.println(lines.get(6));
	}

}
