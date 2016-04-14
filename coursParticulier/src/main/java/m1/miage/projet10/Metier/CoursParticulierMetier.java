package m1.miage.projet10.Metier;

import java.util.Collection;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;

public interface CoursParticulierMetier {
	
	// méthodes dont je aurai besoin
	public Administrateur getAdmin(Administrateur admin);
	public Professeur getProfesseur(Professeur prof);
	public Eleve getEleve(Eleve eleve);
	public Matiere getMatiere(Matiere matiere);
	public Cours getCours(Cours cours);
	public Document getDocument(Document doc);
	public Message getMessage(Message msg);
	public Disponibilite getDispinibilite(Disponibilite dispo);
	public Collection<Cours> getListCours();
}
