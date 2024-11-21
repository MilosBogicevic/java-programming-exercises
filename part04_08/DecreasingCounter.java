package part04_08;

public class DecreasingCounter {
	private int value;

	public DecreasingCounter(int initialValue) {
		this.value = initialValue;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public void decrement() {
		this.value -= 1;
	}

}
