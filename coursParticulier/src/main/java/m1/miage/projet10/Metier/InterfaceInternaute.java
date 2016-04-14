epackage m1.miage.projet10.Metier;

import m1.miage.projet10.Entite.Utilisateur;

public interface InterfaceInternaute {

	public void inscrire(Utilisateur user);
	public Utilisateur seConnecter(String email, String motdepasse);
}
