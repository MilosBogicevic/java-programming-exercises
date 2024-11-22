package part04_15;

public class Statistics {
	private int count;
	private int sum;

	public Statistics() {
		this.count = count;
		this.sum = sum;
	}

	public void addNumber(int number) {
		this.count++;
		this.sum += number;
	}

	public int getCount() {
		return this.count;
	}

	public int sum() {
		return sum;
	}

	public double average() {
		return (double) sum / count;
	}
}
