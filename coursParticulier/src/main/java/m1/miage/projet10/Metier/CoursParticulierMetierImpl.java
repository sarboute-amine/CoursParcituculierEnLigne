package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.CoursPDAO;
import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;


@Transactional
public class CoursParticulierMetierImpl implements CoursParticulierMetier{
	
	private CoursPDAO dao;
	
	public void setDao(CoursPDAO dao) {
		this.dao = dao;
	}

	@Override
	public Administrateur getAdmin(Administrateur admin) {
		return dao.getAdmin(admin);
	}

	@Override
	public Professeur getProfesseur(Professeur prof) {
		return dao.getProfesseur(prof);
	}

	@Override
	public Eleve getEleve(Eleve eleve) {
		return dao.getEleve(eleve);
	}

	@Override
	public Matiere getMatiere(Matiere matiere) {
		return dao.getMatiere(matiere);
	}

	@Override
	public Cours getCours(Cours cours) {
		return dao.getCours(cours);
	}

	@Override
	public Document getDocument(Document doc) {
		return dao.getDocument(doc);
	}

	@Override
	public Message getMessage(Message msg) {
		return dao.getMessage(msg);
	}

	@Override
	public Disponibilite getDispinibilite(Disponibilite dispo) {
		return dao.getDispinibilite(dispo);
	}

	@Override
	public Collection<Cours> getListCours() {
		return dao.getListCours();
	}

}
