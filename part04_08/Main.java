package part04_08;

public class Main {

	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(10);

		counter.printValue();

		counter.decrement();
		counter.printValue();

		counter.decrement();
		counter.printValue();
	}

}
