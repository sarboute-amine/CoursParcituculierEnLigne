package m1.miage.projet10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.hibernate.validator.constraints.Email;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import m1.miage.projet10.Entite.Matiere;
//import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Metier.InterfaceAdministrateur;

public class TestAdministrateur {

	@Test
	public void test() {
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
		
		InterfaceAdministrateur admin = (InterfaceAdministrateur) app.getBean("serviceAdministrateur");
		
		//41
		
		Professeur prof1 = new Professeur("Djafri", "Bachir", new Date(1993, 05, 16), "Evry", "bachir@gmail.fr", "0755", "bachir", Niveau.BAC5);
		Professeur prof2 = new Professeur("Djeloul", "hanichi", new Date(1992, 10, 10), "Evry", "hanichi@gmail.fr", "0755", "bachir", Niveau.BAC5);
		//admin.addProf(prof1);
		//admin.addProf(prof2);
	
		Matiere m1 = new Matiere("Java", Niveau.BAC4, 15L);		
		Matiere m2 = new Matiere("Statistique", Niveau.BAC5, 25L);	
		//admin.addMatiere(m1);
		//admin.addMatiere(m2);
		
		//admin.envoyerMessage(m, l);
	
		
		//admin.supprimerMatiere(6L);
		//admin.supprimerProf(41L);
		//admin.modifierPrixMatiere(7L, 15L);
		//admin.modifierTitreMatiere7L(, "CPAR");
		
		//admin.addCredit(4L, 1L);
		Collection<Long> listID = new LinkedList<Long>();
		listID.add(new Long(1));
		listID.add(new Long(2));
		//Message message = new Message("objetsds", "jjjjjjjj", new Date(), prof1.getNom(), "emeteur");
		//admin.envoyerMessage(message,listID);
			
		
	}
	
	

}
