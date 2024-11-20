package part04_01;

public class YourFirstAccount {

	public static void main(String[] args) {
		Account account = new Account("Arto's account", 100);
		account.deposit(20.0);

		System.out.println(account);
	}

}
