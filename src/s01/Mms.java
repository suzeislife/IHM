package s01;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Mms extends Message {

	public String message;
	public Image image;

	public Mms(String message/* , Image image */, String sender, ArrayList<String> recipients) {
		super();
		this.message = message;
		this.sender = sender;
		this.recipients = recipients;
		// this.image = image;
	}

	@Override
	public void display() {
		System.out.println("MMS envoyé par " + sender + " à " + recipients + " : " + toString());
	}

	@Override
	public String toString() {
		return message + super.toString();
	}

}
