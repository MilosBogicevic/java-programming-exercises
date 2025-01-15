package part06_03;

public class Main {

	public static void main(String[] args) {
		MessagingService service = new MessagingService();

		Message msg1 = new Message("Alice", "Hello, this is my first message!");
		Message msg2 = new Message("Bob", "This message content is intentionally kept short.");
		Message msg3 = new Message("Charlie",
				"This message is way too long. It is definitely more than 280 characters long, and it should not be allowed in the messaging service. This should trigger the condition where the content is too long for the message to be added.");

		service.add(msg1);
		service.add(msg2);
		service.add(msg3);

		for (Message msg : service.getMessages()) {
			System.out.println(msg);
		}
	}

}
