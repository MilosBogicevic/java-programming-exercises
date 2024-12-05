package part05_06;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();

		System.out.println(counter.value());

		counter.increase();

		System.out.println(counter.value());

		counter.increase(5);

		System.out.println(counter.value());

		counter.decrease();

		System.out.println(counter.value());

		counter.decrease(-3);

		System.out.println(counter.value());
	}

}
