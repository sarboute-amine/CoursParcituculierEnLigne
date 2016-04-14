package m1.miage.projet10.DAO;

import java.util.Collection;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.EspacePersonnel;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Statut;
import m1.miage.projet10.Entite.Utilisateur;

public class CoursPDAO implements InterfaceCoursPDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public boolean addProf(Professeur user) {
		/*
		Query r = em.createQuery("select p from Utilisateur p where p.TypeUtilisateur:=x");
		r.setParameter("x", "prof");
		Collection<Professeur> profes = r.getResultList();
		if(!profes.isEmpty())
		{
			for (Professeur p : profes) {
				if (p.getEmail().equals(user.getEmail()))
					return false;
			}
		}*/
		em.persist(user);
		return true;
	}

	@Override
	public boolean supprimerProf(Long idProf) {
		Professeur p = em.find(Professeur.class, idProf);
		em.remove(em.merge(p));
		return true;
	}

	@Override
	public boolean modifierStatutProf(Statut statut, Long idProf) {
		Professeur p = (Professeur) em.find(Utilisateur.class, idProf);
		p.setStatut(statut);
		em.merge(p);
		return true;
	}

	@Override
	public boolean addMatiere(Matiere matiere) {
		Query r = em.createQuery("select m from Matiere m");
		Collection<Matiere> matieres = r.getResultList();
		for(Matiere m : matieres)
		{
			if(m.equals(matiere))
				return false;
		}
		em.persist(matiere);
		return true;
	}

	@Override
	public boolean supprimerMatiere(Long idMatiere) {
		Matiere m = em.find(Matiere.class, idMatiere);
		em.remove(em.merge(m));
		return true;
	}

	

	@Override
	public Collection<Eleve> getListEleve() {
		Query requet = em.createQuery("select e from Eleve e");
		return requet.getResultList();
	}

	@Override
	public Collection<Professeur> getListProf() {
		Query requet = em.createQuery("select p from Professeur p");
		return requet.getResultList();
	}

	@Override
	public String modifierTitreMatiere(Long idMatiere, String intitule) {
		Matiere m = em.find(Matiere.class, idMatiere);
		m.setIntitule(intitule);
		em.merge(m);
		return m.getIntitule();
	}

	@Override
	public boolean addCredit(Long credit, Long idEleve) {
		Eleve e =  em.find(Eleve.class, idEleve);
		e.setCredit(e.getCredit()+credit);
		em.merge(e);
		return true;
		
	}
	
	@Override
	public Collection<Cours> consulterCours(Long idEleve) {
		Eleve e = em.find(Eleve.class, idEleve);
		e.getListeCours().isEmpty();
		return e.getListeCours();
	}

	@Override
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau) {
		Query requet = em.createQuery("select c from Cours c where c.matiere=:x and c.niveau=:y");
		requet.setParameter("x", matiere);
		requet.setParameter("y", niveau);
		return requet.getResultList();
	}

	@Override
	public Collection<Cours> rechercheCours(Niveau niveau) {
		// TODO Auto-generated method stub
		Query requet = em.createQuery("select c from Cours c where c.niveau=:y");
		requet.setParameter("y", niveau);
		return requet.getResultList();
		
	}

	@Override
	public Collection<Cours> rechercherCours(String motCle) {
		// TODO Auto-generated method stub
		Query requet = em.createQuery("select c from Cours c where c.intituleCours like :x");
		requet.setParameter("x", "%"+motCle+"%");
		return requet.getResultList();
		
	}

	@Override
	public boolean acheterCours(Cours cours, Long idEleve) {
		// TODO Auto-generated method stub
		Eleve el = (Eleve) em.find(Utilisateur.class, idEleve);
		if(el.getCredit()!=null && el.getCredit() > cours.getPrix())
		{	
			el.setCredit(el.getCredit()-cours.getPrix());
			el.getListeCours().add(cours);
			em.merge(el);
			return true;
		}
			return false;
	}

	@Override
	public Long rechargerCredit(Long credit, Long idEleve) {
		Eleve el = (Eleve) em.find(Utilisateur.class, idEleve);
		el.setCredit(el.getCredit()+credit);
		em.merge(el);
		return el.getCredit();
	}

	@Override
	public EspacePersonnel getEspacePersonnel(Long idEleve) {
		Eleve el = (Eleve) em.find(Utilisateur.class, idEleve);
		return el.getEspacePersonnel();
	}
	
	@Override
	public Collection<Document> getListDocument(EspacePersonnel esp) {
		return (Collection<Document>) em.find(Disponibilite.class, esp.getIdEspacePersonne());
	}
	
	@Override
	public Collection<Disponibilite> getListDispo(Long idProf) {
		Professeur p = (Professeur) em.find(Utilisateur.class, idProf);
		p.getListeDisponibilte().size();
		return p.getListeDisponibilte();
	}

	// à vérifier
	@Override
	public Collection<Disponibilite> getlistDispoCours(Cours c, Long idProf) {
		Professeur p = (Professeur) em.find(Utilisateur.class, idProf);
		Cours c1 = getCours(c);
		for(Cours cours : p.getListeCours())
		{
			if(cours.equals(c1))
				return cours.getDate();
		}
		return null;
	}

	
	@Override
	public Cours addCours(Cours c, Long idProf) {
		Professeur p = em.find(Professeur.class, idProf);
		for(Disponibilite d : c.getDate())
		{
			em.persist(d);
			p.getListeDisponibilte().add(d);
		}
			
		Matiere mat = em.find(Matiere.class, c.getMatiere().getIdMatiere());
		c.setMatiere(mat);
		System.out.println(mat.getIdMatiere());
		
		em.persist(c);
		p.getListeCours().isEmpty();
		p.getListeCours().add(c);
		return c;
	}

	@Override
	public Cours addCours(Cours c, Collection<Disponibilite> IdDispo, Long idProf) {
		em.persist(IdDispo);
		em.persist(c);
		c.setDate(IdDispo);
		em.merge(c);
		Professeur p = em.find(Professeur.class, idProf);
		p.getListeCours().add(c);
		for(Disponibilite d : IdDispo)
			p.getListeDisponibilte().add(d);
		em.merge(p);
		return c;
	}


	@Override
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Long idProf) {
		for(Eleve e : listeEleve)
		{		
			em.persist(doc);		
			e.getEspacePersonnel().getListeDocument().add(doc);
			em.merge(e);
		}
	}

	@Override
	public Collection<Eleve> getElevesByCours(Cours c, Long idProf) {
		
		Collection<Eleve> listEleves=null;
		Professeur prof = em.find(Professeur.class, idProf);
		if(!getListEleve().isEmpty())
		{
			for(Eleve eleve : getListEleve())
			{
				if(eleve.getListeCours().contains(c))
					listEleves.add(eleve);
			}
			return listEleves;
		}
		return null;
	}

	@Override
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Long idProf) {
		Professeur p = (Professeur) em.find(Utilisateur.class, idProf);
		p.getListeDisponibilte().remove(Dispo);
		em.merge(p);
		return null;
	}

	@Override
	public boolean addDispo(Disponibilite d, Long idProf) {
		Professeur p =  em.find(Professeur.class, idProf);
		em.persist(d);
		p.getListeDisponibilte().add(d);
		em.merge(p);
		return true;
	}
	
	@Override
	public boolean sedeconnecter() {
		
		return false;
	}

	@Override
	public boolean supprimerMessage(Message msg) {
		em.remove(em.merge(msg));
		return true;
	}

	@Override
	public Collection<Message> getMessages() {
		Query requet = em.createQuery("select m from Message m");
		return requet.getResultList();
	}
	
	@Override
	public boolean envoyerMessage(Message msg, Collection<Long> idUtilisateur) {
		for(Long id : idUtilisateur)
		{
			Utilisateur u = em.find(Utilisateur.class, id);
			em.persist(msg);
			System.err.println(u.getNom());
			u.getListsMessage().add(msg);
			em.refresh(u);
		}
		return true;
	}
	@Override
	public Message getMessage(Message msg) {
		Query requet = em.createQuery("select m from Message m where "
				+ "m.objet=:objet"
				+ " and m.destinataire=:d");
		requet.setParameter("objet", msg.getObjet());
		requet.setParameter("d", msg.getEmailDestinataire());
		return (Message) requet.getSingleResult();
	
	}

	@Override
	public boolean modifierMail(String mail, Long idUtilisateur) {
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setEmail(mail);
		em.merge(u);
		return true;
	}

	@Override
	public boolean modifierMDP(String mdp, Long idUtilisateur) {
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		u.setMotDePasse(mdp);
		em.merge(u);
		return true;
	}

	@Override
	public String reinitilialiserMDP(Long idUtilisateur) {
		Utilisateur u = em.find(Utilisateur.class, idUtilisateur);
		return u.getMotDePasse();
		
	}

	@Override
	public Utilisateur seConnecter(String email, String motdepasse) {
		Query requet  = em.createQuery("select u from Utilisateur u where u.email=:x"
				+ " and u.motDePasse=:y");
		requet.setParameter("x", email);
		requet.setParameter("y", motdepasse);
		if(requet.getResultList().isEmpty())
			return null;
		return (Utilisateur) requet.getSingleResult();
	}

	@Override
	public boolean modifierProfilProf(Professeur prof, Long idProf) {
		Professeur p  = em.find(Professeur.class, idProf);
		p = prof;
		em.merge(p);
		return true;
		
	}

	@Override
	public void saisirCompteRendu(String text, Long idCours, Long idProf) {
		for(Cours cours : getListCoursProfesseur(idProf))
			if(cours.getIdCours().equals(idCours))
				cours.setCompteRendu(text);
	}

	@Override
	public void inscrire(Utilisateur user) {
		EspacePersonnel ep;
		if(user.getClass().equals(Eleve.class))
		{
			ep = new EspacePersonnel();
			em.persist(ep);
			Eleve e =  (Eleve) user;
			e.setEspacePersonnel(ep);
			em.persist(e);
		}else
			em.persist(user);
	}

	@Override
	public boolean modifierPrixMatiere(Long idMatiere, Long prix) {
		Matiere m = em.find(Matiere.class, idMatiere);
		m.setPrix(prix);
		em.merge(m);
		return true;
	}

	@Override
	public Collection<Cours> getListCoursProfesseur(Long idProf) {
		Professeur  p = em.find(Professeur.class, idProf);
		p.getListeCours().size();
		return p.getListeCours();
	}

	@Override
	public Collection<Matiere> getlistMatiere() {
		Query requet = em.createQuery("select e from Matiere e");
		return requet.getResultList();
	}

	@Override
	public Collection<Cours> getListCours() {
		Query requet = em.createQuery("select c from Cours c");
		return requet.getResultList();
	}

	//Méthodes dont j en aurai besoin surement
	@Override
	public Administrateur getAdmin(Administrateur admin) {
		Query requet = em.createQuery("select a from Administrateur a where a.nom=:x and "
				+ "a.prenom=:y and a.adresse=:z and a.email=email");
		requet.setParameter("x", admin.getNom());
		requet.setParameter("y", admin.getPrenom());
		requet.setParameter("z", admin.getAdresse());
		return (Administrateur) requet.getSingleResult();
	}

	@Override
	public Professeur getProfesseur(Professeur prof) {
		Query requet = em.createQuery("select p from Professeur p where p.nom=:x and p.prenom=:y and p.adresse=:z and p.email=email");
		requet.setParameter("x", prof.getNom());
		requet.setParameter("y", prof.getPrenom());
		requet.setParameter("z", prof.getAdresse());
		return (Professeur) requet.getSingleResult();
		
	}

	@Override
	public Eleve getEleve(Eleve eleve) {
		Query requet = em.createQuery("select e from Eleve e where e.nom=:x and e.prenom=:y"
				+ " and e.adresse=:z and e.email=:email");
		requet.setParameter("x", eleve.getNom());
		requet.setParameter("y", eleve.getPrenom());
		requet.setParameter("z", eleve.getAdresse());
		requet.setParameter("email", eleve.getEmail());
		return (Eleve) requet.getSingleResult();
		
	}

	@Override
	public Matiere getMatiere(Matiere matiere) {
		Query requet = em.createQuery("select m from Matiere m where m.intitule=:intitule"
				+ " and m.niveau=:niveau");
		requet.setParameter("intitule", matiere.getIntitule());
		requet.setParameter("niveau", matiere.getNiveau());
		return (Matiere) requet.getSingleResult();
	}

	@Override
	public Cours getCours(Cours cours) {
		Query requet = em.createQuery("select c from Cours c where c.intituleCours=:intituleCours"
				+ " and c.matiere.idMatiere=:idMat");
		requet.setParameter("intituleCours", cours.getIntituleCours());
		requet.setParameter("idMat", getMatiere(cours.getMatiere()).getIdMatiere());
		return (Cours) requet.getSingleResult();
	}

	@Override
	public Document getDocument(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Disponibilite getDispinibilite(Disponibilite dispo) {
		Query requet = em.createQuery("select d from Disponibilite d where "
				+ "d.date=:date"
				+ " and d.heureDebut=:hd"
				+ "and d.heureFin=:hf");
		requet.setParameter("date", dispo.getDate());
		requet.setParameter("hd", dispo.getHeureDebut());
		requet.setParameter("hf", dispo.getHeureFin());
		return (Disponibilite) requet.getSingleResult();
	}

	@Override
	public Utilisateur getUilisateur(Utilisateur user) {
		Query requet = em.createQuery("select u from Utilisateur u where "
				+ "d.email=:email"
				+ " and d.nom=:nom"
				+ "and d.prenom=:prenom"
				+ "and d.adresse=:adresse");
		requet.setParameter("email", user.getEmail());
		requet.setParameter("nom", user.getNom());
		requet.setParameter("prenom", user.getPrenom());
		requet.setParameter("adresse", user.getAdresse());
		return (Utilisateur) requet.getSingleResult();
	}

}