package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.InterfaceCoursPDAO;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Utilisateur;


@Transactional
public class ServiceAdministrateur implements InterfaceAdministrateur{

	private InterfaceCoursPDAO dao;
	
	public void setDao(InterfaceCoursPDAO dao) {
		this.dao = dao;
	}

	@Override
	public Collection<Professeur> getListProf() {
		// TODO Auto-generated method stub
		
		return dao.getListProf();
	}
	
	@Override
	public boolean addProf(Professeur user) {		
		return dao.addProf(user);
	}

	@Override
	public boolean supprimerProf(Long idProf) {
		
		return dao.supprimerProf(idProf);
	}

	@Override
	public boolean addMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		
		return dao.addMatiere(matiere);
	}

	@Override
	public boolean supprimerMatiere(Long idMatiere) {
		// TODO Auto-generated method stub
		
		return dao.supprimerMatiere(idMatiere);
		
	}
	
	@Override
	public boolean modifierPrixMatiere(Long idMatiere, Long prix) {
		// TODO Auto-generated method stub
		return dao.modifierPrixMatiere(idMatiere, prix);
	}
	@Override
	public String modifierTitreMatiere(Long idMAtiere, String intitule) {
		// TODO Auto-generated method stub
		return dao.modifierTitreMatiere(idMAtiere, intitule);
	}
	
	@Override
	public boolean addCredit(Long credit, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.addCredit(credit, idEleve);
	}
	
	@Override
	public Collection<Matiere> getlistMatiere() {
		return dao.getlistMatiere();
	}
	
	// serives Communs
	@Override
	public boolean sedeconnecter() {
		return dao.sedeconnecter();
	}

	@Override
	public boolean supprimerMessage(Message msg) {
		// TODO Auto-generated method stub
		return dao.supprimerMessage(msg);
	}

	@Override
	public Collection<Message> getMessages() {
		// TODO Auto-generated method stub
		return dao.getMessages();
	}
	@Override
	public boolean envoyerMessage(Message msg, Collection<Long> idUtilisateur) {
		return dao.envoyerMessage(msg, idUtilisateur);
	}
	@Override
	public boolean modifierMail(String mail, Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.modifierMail(mail, idUtilisateur);
	}

	@Override
	public boolean modifierMDP(String mdp, Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.modifierMDP(mdp, idUtilisateur);
	}

	@Override
	public String reinitilialiserMDP(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return dao.reinitilialiserMDP(idUtilisateur);
	}

	@Override
	public Collection<Eleve> getListEleve() {
		return dao.getListEleve();
	}

	
	
}
