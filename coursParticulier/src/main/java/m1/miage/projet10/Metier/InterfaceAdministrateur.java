package m1.miage.projet10.Metier;

import java.util.Collection;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Utilisateur;

public interface InterfaceAdministrateur {
	
	public boolean addProf(Professeur user);
	public boolean supprimerProf(Long idProf);
	public String modifierTitreMatiere(Long idMAtiere, String intitule);
	public boolean addMatiere(Matiere matiere);
	public boolean supprimerMatiere(Long idMatiere);
	public boolean modifierPrixMatiere(Long idMatiere,Long prix);
	public Collection<Professeur> getListProf();
	public boolean addCredit(Long credit, Long idEleve);
	public Collection<Matiere> getlistMatiere();
	public Collection<Eleve> getListEleve();
	// Serives Communs
	public boolean sedeconnecter();
	public boolean envoyerMessage(Message msg, Collection<Long> idUtilisateur);
	public boolean supprimerMessage(Message msg);
	public Collection<Message> getMessages();
	public boolean modifierMail(String mail, Long idUtilisateur);
	public boolean modifierMDP(String mdp, Long idUtilisateur);
	public String reinitilialiserMDP(Long idUtilisateur);
	
	
}
