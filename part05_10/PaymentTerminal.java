package part05_10;

public class PaymentTerminal {
	private double money;
	private int affordableMeals;
	private int heartyMeals;

	public PaymentTerminal() {
		this.money = 1000;
		this.affordableMeals = 0;
		this.heartyMeals = 0;
	}

	public double eatAffordably(double payment) {
		double mealPrice = 2.5;
		if (payment >= mealPrice) {
			affordableMeals++;
			this.money += mealPrice;
			return payment - mealPrice;
		} else {
			return payment;
		}

	}

	public double eatHeartily(double payment) {
		double mealPrice = 4.3;
		if (payment >= mealPrice) {
			heartyMeals++;
			this.money += mealPrice;
			return payment - mealPrice;
		} else {
			return payment;
		}
	}

	@Override
	public String toString() {
		return "money: " + money + ", number of sold affordable meals: " + affordableMeals
				+ ", number of sold hearty meals: " + heartyMeals;
	}
}
