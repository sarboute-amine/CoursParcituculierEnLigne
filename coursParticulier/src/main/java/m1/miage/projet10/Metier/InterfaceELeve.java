package m1.miage.projet10.Metier;

import java.util.Collection;

import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.EspacePersonnel;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Utilisateur;

public interface InterfaceELeve {
	
	public Collection<Cours> consulterCours(Long idEleve);
	public boolean acheterCours(Cours cours, Long idEleve);
	public Long rechargerCredit(Long credit, Long idEleve);
	public EspacePersonnel getEspacePersonnel(Long idEleve);
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau);
	public Collection<Cours> rechercheCours(Niveau niveau);
	public Collection<Cours> rechercherCours(String motCle);
	public Collection<Document> getListDocument(EspacePersonnel esp);
	
	// Serices Communs
	public boolean sedeconnecter();
	public boolean envoyerMessage(Message msg, Collection<Long> idUtilisateur);
	public boolean supprimerMessage(Message msg);
	public Collection<Message> getMessages();
	public boolean modifierMail(String mail, Long idUtilisateur);
	public boolean modifierMDP(String mdp, Long idUtilisateur);
	public String reinitilialiserMDP(Long idUtilisateur);
	
	public Collection<Cours> getListCours();
	
	
}
