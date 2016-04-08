package s01.test;

import java.util.ArrayList;

import javafx.embed.swing.JFXPanel;
import s01.Email;
import s01.MailBox;
import s01.Mms;
import s01.Sms;
import s01.Vocal;

public class TestMailBox {
	public static void main(String[] args) {

		new JFXPanel();
		MailBox myMail = new MailBox();
		char[] smsContent = "Serai en retard pour l'ap�ro, exercice IHM plus long que pr�vu".toCharArray();
		ArrayList<String> dest = new ArrayList<>();

		dest.add("Lucas");
		dest.add("Joey");
		Sms sms = new Sms(smsContent, "J�r�my", dest);
		myMail.send(sms);
		dest.clear();
		dest.add("Jacques");
		Email email = new Email("Serai en retard pour l'ap�ro, exercice IHM plus long que pr�vu", "Paul", dest);
		myMail.send(email);
		dest.clear();
		dest.add("Luc");
		Mms mms = new Mms("Serai en retard pour l'ap�ro, exercice IHM plus long que pr�vu", "Jean", dest);
		myMail.send(mms);
		dest.clear();
		dest.add("J�r�my");
		Vocal vocal = new Vocal("Serai en retard pour l'ap�ro, exercice IHM plus long que pr�vu", "Lucas", dest);
		myMail.send(vocal);

		// myMail.receive(sms);

		double random = Math.random() * 100;
		if (random >= 50.0 && random < 80.0) {
			myMail.receive(email);
		} else if (random >= 80.0 && random < 90.0) {
			myMail.receive(sms);
		} else if (random >= 90.0 && random < 100.0) {
			myMail.receive(mms);
		} else {
			myMail.receive(null);
		}

	}

}
