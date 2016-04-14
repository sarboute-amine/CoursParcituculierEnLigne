package m1.miage.projet10;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Utilisateur;
import m1.miage.projet10.Metier.CoursParticulierMetier;
import m1.miage.projet10.Metier.InterfaceAdministrateur;
import m1.miage.projet10.Metier.InterfaceELeve;
import m1.miage.projet10.Metier.InterfaceInternaute;
import m1.miage.projet10.Metier.InterfaceProfesseur;
import m1.miage.projet10.Metier.ServiceEleve;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
		
		InterfaceInternaute serviceInternaute = (InterfaceInternaute) app.getBean("serviceInternaute");
		
		InterfaceAdministrateur serviceAdmin = (InterfaceAdministrateur) app.getBean("serviceAdministrateur");
		InterfaceProfesseur serviceProf = (InterfaceProfesseur) app.getBean("serviceProfesseur");
		InterfaceELeve serviceEleve = (InterfaceELeve) app.getBean("serviceEleve");
		
		Matiere mat = new Matiere("C++", Niveau.BAC4, 20L);
		
		Administrateur admin= new Administrateur("omar", "omar", null, null, "omar@yahoo.fr", null, "omaromar", Niveau.BAC4);
		Professeur bachir = new Professeur("DJafri", "Bachir", new Date(), "", "youcef.boukersi@yahoo.fr", null, "youyou", Niveau.BAC4);
		Long l = new Long(50);
		
		Eleve e = new Eleve("boukersi", "youcef", new Date(), "kk", "yocuef@yahoo.fr", "0999", "yoou", Niveau.BAC1, 9L);
		
		//serviceInternaute.inscrire(e);
		//serviceAdmin.addCredit(44L, 1L);
	}
}

