package part05_06;

public class Counter {
	private int value;

	public Counter(int startValue) {
		this.value = startValue;
	}

	public Counter() {
		this.value = 0;
	}

	public int value() {
		return this.value;
	}

	public void increase() {
		increase(1);
	}

	public void decrease() {
		decrease(1);
	}

	public void increase(int increaseValue) {
		if (increaseValue > 0) {
			this.value += increaseValue;
		}
	}

	public void decrease(int decreaseValue) {
		if (decreaseValue > 0) {
			this.value -= decreaseValue;
		}
	}
}
