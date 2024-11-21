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
		if (value > 0) {
			this.value--;
		}
	}

	public void reset() {
		this.value = 0;
	}

}
