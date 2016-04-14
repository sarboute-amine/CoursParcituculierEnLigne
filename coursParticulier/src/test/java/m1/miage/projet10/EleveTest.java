package m1.miage.projet10;

import java.util.Collection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import m1.miage.projet10.Entite.Cours;
//import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Metier.InterfaceELeve;

public class EleveTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		InterfaceELeve eleve = (InterfaceELeve) app.getBean("serviceEleve");
		
		Cours cachter = null;
		/*
		for(Cours c : eleve.rechercherCours("thre"))
			cachter= c;
		System.out.println(cachter.getIntituleCours());
		//eleve.acheterCours(cachter, 1L);
		Collection<Cours> cours = eleve.consulterCours(1L);
		if (cours.isEmpty()) {
			System.out.println("Vous n'avez pas ecore acheter de cours !");
		} else {
			for (Cours d1 : cours) {
					System.out.println("Vous avez :"+d1.getIntituleCours() + "  " + d1.getIdCours());
			}
		}
		
		for(Message m : eleve.getMessages())
			{
				if(!m.isLu())
					System.out.println("Message " +m.getEmailEmeteur());
			}*/

	}

}
