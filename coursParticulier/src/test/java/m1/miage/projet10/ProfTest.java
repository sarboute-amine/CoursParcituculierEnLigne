package m1.miage.projet10;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Metier.InterfaceProfesseur;

public class ProfTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
				new String[] { "ApplicationContext.xml" });
		InterfaceProfesseur prof = (InterfaceProfesseur) app.getBean("serviceProfesseur");

		Collection<Matiere> matieres = prof.getlistMatiere();
		Matiere mat = null;
		for (Matiere m : matieres)
			mat = m;

		// ajouter une Cours
		Disponibilite dispo1 = new Disponibilite(new Date(), "12h00", "14H00");
		Collection<Disponibilite> dispos = new LinkedList<Disponibilite>();
		dispos.add(dispo1);
		Cours thread = new Cours("Thread", 25L, "2H", null, mat, dispos);

		 //prof.addCours(thread, 2L);

		for (Cours d1 : prof.getListCoursProfesseur(2L)) {
			if (d1.getIntituleCours().equals(thread.getIntituleCours()))
				thread = d1;
		}

		/*/ for(Disponibilite d1 : prof.getListDispo(42L))
		*/// System.out.println(d1.getDate()+" "+d1.getHeureDebut());

		Collection<Eleve> e = prof.getElevesByCours(thread, 2L);
		if (e==null) {
			System.out.println("aucun etudiant n'a acheté votre cours");
		} else {
			for (Eleve el : e)
				System.out.println(el.getNom() + "  " + el.getIdUtilisateur());
		}

	}

}
