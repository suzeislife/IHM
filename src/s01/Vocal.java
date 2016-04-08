package s01;

import java.util.ArrayList;

public class Vocal extends Message {
	public String message;

	public Vocal(String message, String sender, ArrayList<String> recipients) {
		super();
		this.message = message;
		this.sender = sender;
		this.recipients = recipients;
	}

	@Override
	public void display() {
		System.out.println("Vocal envoyé par " + sender + " à " + recipients + " : " + toString());
	}

	@Override
	public String toString() {
		return message + super.toString();
	}
}
