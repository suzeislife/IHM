package s01;

public class MailBox {

	public void send(Message message) {
		message.display();
	}

	public void receive(Message message) {
		if (message == null)
			System.out.println("Aucun message");
		else
			System.out.println("Nouveau " + message.getClass().getName().substring(4));
	}
}
