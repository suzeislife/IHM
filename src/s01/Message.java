package s01;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public abstract class Message implements Colorable{

	protected String sender;
	protected String message;
	protected ArrayList<String> recipients;
	protected Color c;

	public Message() {

	}

	public Message(String message, String sender, ArrayList<String> recipients) {
		this.message = message;
		this.sender = sender;
		this.recipients = recipients;
		c = Color.WHITE;
	}

	public abstract void display();

	public String getSender() {
		return sender;
	}

	public ArrayList<String> getRecipients() {
		return recipients;
	}

	@Override
	public String toString() {
		return " Color " + c;
	}
	
	public void paint(Color c){
		this.c = c;
	}

	public Color whatColor(){
		return this.c;
	}
}
