package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.InterfaceCoursPDAO;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.EspacePersonnel;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;

@Transactional
public class ServiceEleve implements InterfaceELeve{
	
	private InterfaceCoursPDAO dao;
	

	public void setDao(InterfaceCoursPDAO dao) {
		this.dao = dao;
	}

	@Override
	public Collection<Cours> consulterCours(Long idEleve) {
		// TODO Auto-generated method stub
		
		return dao.consulterCours(idEleve);
	}

	@Override
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(matiere, niveau);
	}

	@Override
	public Collection<Cours> rechercheCours(Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercheCours(niveau);
	}

	@Override
	public Collection<Cours> rechercherCours(String motCle) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(motCle);
	}

	@Override
	public Collection<Document> getListDocument(EspacePersonnel esp) {
		// TODO Auto-generated method stub
		return dao.getListDocument(esp);
	}
	
	@Override
	
	public boolean acheterCours(Cours cours, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.acheterCours(cours, idEleve);
	}

	@Override
	public Long rechargerCredit(Long credit, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.rechargerCredit(credit, idEleve);
	}

	@Override
	public EspacePersonnel getEspacePersonnel(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.getEspacePersonnel(idEleve);
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

		@Override
		public Collection<Cours> getListCours() {
			return dao.getListCours();
		}
	
}
