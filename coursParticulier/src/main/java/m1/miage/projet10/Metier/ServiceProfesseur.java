package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.InterfaceCoursPDAO;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Statut;
import m1.miage.projet10.Entite.Utilisateur;

@Transactional
public class ServiceProfesseur implements InterfaceProfesseur {

	private InterfaceCoursPDAO dao;
	
	
	@Override
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Long idProf) {
		dao.deposerDocument(doc, listeEleve, idProf);
	}
	
	// serives Communs
		@Override
		public boolean sedeconnecter() {
			return dao.sedeconnecter();
		}

		@Override
		public boolean envoyerMessage(Message msg, Collection<Long> users) {
			// TODO Auto-generated method stub
			return dao.envoyerMessage(msg, users);
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

	public void setDao(InterfaceCoursPDAO dao) {
			this.dao = dao;
		}
	@Override
	public boolean modifierProfilProf(Professeur prof, Long idProf) {
		// TODO Auto-generated method stub
		return dao.modifierProfilProf(prof, idProf);
	}
	@Override
	public boolean modifierStatutProf(Statut statut, Long idProf) {
		return dao.modifierStatutProf(statut, idProf);
	}
	@Override
	public Collection<Cours> getListCoursProfesseur(Long idProf) {
		// TODO Auto-generated method stub
		return dao.getListCoursProfesseur(idProf);
	}

	@Override
	public Collection<Disponibilite> getListDispo(Long idProf) {
		// TODO Auto-generated method stub
		return dao.getListDispo(idProf);
	}

	@Override
	public Collection<Disponibilite> getlistDispoCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.getlistDispoCours(c, idProf);
	}

	@Override
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Long idProf) {
		// TODO Auto-generated method stub
		return dao.supprimerDisponibilite(Dispo, idProf);
	}

	@Override
	public boolean addDispo(Disponibilite d, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addDispo(d, idProf);
	}

	@Override
	public Cours addCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addCours(c, idProf);
	}

	@Override
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Long idProf) {
		// TODO Auto-generated method stub
		return dao.addCours(c, dispo , idProf);
	}

	@Override
	public void saisirCompteRendu(String text, Long idCours, Long idProf) {
		// TODO Auto-generated method stub
		dao.saisirCompteRendu(text, idCours, idProf);
	}

	@Override
	public Collection<Eleve> getElevesByCours(Cours c, Long idProf) {
		// TODO Auto-generated method stub
		return dao.getElevesByCours(c, idProf);
	}

	@Override
	public Collection<Matiere> getlistMatiere() {
		return dao.getlistMatiere();
	}
	
	
}
