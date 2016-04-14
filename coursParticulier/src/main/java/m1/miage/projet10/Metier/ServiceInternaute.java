package m1.miage.projet10.Metier;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.InterfaceCoursPDAO;
import m1.miage.projet10.Entite.Utilisateur;

@Transactional
public class ServiceInternaute implements InterfaceInternaute{
	
	private InterfaceCoursPDAO dao;
	
	@Override
	public void inscrire(Utilisateur user) {
		// TODO Auto-generated method stub
		dao.inscrire(user);
	}
	
	@Override
	public Utilisateur seConnecter(String email, String motdepasse) {
		// TODO Auto-generated method stub
		return dao.seConnecter(email, motdepasse);
	}

	public void setDao(InterfaceCoursPDAO dao) {
		this.dao = dao;
	}
}
