package s01;

import java.util.ArrayList;

public class Sms extends Message {

	public char[] message = new char[160];

	public Sms(char[] message, String sender, ArrayList<String> recipients) {
		super();
		this.message = message;
		this.sender = sender;
		this.recipients = recipients;
	}

	@Override
	public void display() {
		System.out.println("SMS envoyé par " + sender + " à " + recipients + " : " + toString());
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < message.length; i++) {
			result += message[i];
		}
		return result + super.toString();
	}

}
