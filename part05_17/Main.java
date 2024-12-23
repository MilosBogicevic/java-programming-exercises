package part05_17;

public class Main {

	public static void main(String[] args) {
		Money firstMoneyObject = new Money(7, 50);
		Money secondMoneyObject = new Money(1, 60);
		Money firstPlusSecond = firstMoneyObject.plus(secondMoneyObject);
		System.out.println(firstPlusSecond);
	}

}
