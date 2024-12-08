package part05_10;

public class PaymentTerminal {

	private static final double AFFORDABLE_PRICE = 2.5;
	private static final double HEARTY_PRICE = 4.3;

	private double money;
	private int affordableMeals;
	private int heartyMeals;

	public PaymentTerminal() {
		this.money = 1000;
		this.affordableMeals = 0;
		this.heartyMeals = 0;
	}

	public double eatAffordably(double payment) {
		if (payment >= AFFORDABLE_PRICE) {
			this.affordableMeals++;
			this.money += AFFORDABLE_PRICE;
			return payment - AFFORDABLE_PRICE;
		} else {
			return payment;
		}

	}

	public double eatHeartily(double payment) {
		if (payment >= HEARTY_PRICE) {
			this.heartyMeals++;
			this.money += HEARTY_PRICE;
			return payment - HEARTY_PRICE;
		} else {
			return payment;
		}
	}

	public boolean eatAffordably(PaymentCard card) {
		if (card.takeMoney(AFFORDABLE_PRICE)) {
			this.affordableMeals++;
			return true;
		} else {
			return false;
		}
	}

	public boolean eatHeartily(PaymentCard card) {
		if (card.takeMoney(HEARTY_PRICE)) {
			heartyMeals++;
			return true;
		} else {
			return false;
		}
	}

	public void addMoneyToCard(PaymentCard card, double sum) {
		if (sum > 0) {
			card.addMoney(sum);
			money += sum;
		}
	}

	@Override
	public String toString() {
		return "money: " + money + ", number of sold affordable meals: " + affordableMeals
				+ ", number of sold hearty meals: " + heartyMeals;
	}
}
