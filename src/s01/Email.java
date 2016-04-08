package s01;

import java.util.ArrayList;

public class Email extends Message{

  private String message;
  
  

  public Email(String message, String sender, ArrayList<String> recipients) {
    super();
    this.message = message;
    this.sender = sender;
    this.recipients = recipients;
  }

  @Override
  public void display() {
    System.out.println("Email envoyé par " + sender + " à " + recipients + " : " + toString());
  }
  
  @Override
  public String toString(){
    return message + super.toString();
  }
  

}
