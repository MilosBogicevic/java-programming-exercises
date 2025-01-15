package part06_03;

import java.util.ArrayList;

public class MessagingService {
	private ArrayList<Message> messages;

	public MessagingService() {
		this.messages = new ArrayList<>();
	}

	public void add(Message message) {
		if (message.getContent().length() <= 180) {
			messages.add(message);
		}
	}

	public ArrayList<Message> getMessages() {
		return new ArrayList<>(messages);
	}

}
