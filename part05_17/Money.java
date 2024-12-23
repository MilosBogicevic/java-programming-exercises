package part05_17;

public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return this.euros;
	}

	public int cents() {
		return this.cents;
	}

	public Money plus(Money addition) {
		int totalCents = this.cents + addition.cents();
		int totalEuros = this.euros + addition.euros();

		if (totalCents >= 100) {
			totalEuros += totalCents / 100;
			totalCents = totalCents % 100;
		}

		return new Money(totalEuros, totalCents);
	}

	public Money minus(Money decreaser) {
		int totalCentsThis = this.euros * 100 + this.cents;
		int totalCentsDecreaser = decreaser.euros() * 100 + decreaser.cents();

		int resultCents = totalCentsThis - totalCentsDecreaser;

		if (resultCents < 0) {
			resultCents = 0;
		}

		int resultEuros = resultCents / 100;
		int resultRemainingCents = resultCents % 100;

		return new Money(resultEuros, resultRemainingCents);
	}

	public boolean lessThan(Money compared) {
		int totalCentsThis = this.euros * 100 + this.cents;
		int totalCentsCompared = compared.euros() * 100 + compared.cents();

		return totalCentsThis < totalCentsCompared;
	}

	public String toString() {
		String zero = "";
		if (this.cents <= 10) {
			zero = "0";
		}

		return euros + "." + String.format("%02d", cents) + "e";
	}
}
