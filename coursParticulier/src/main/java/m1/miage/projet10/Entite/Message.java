package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Message implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMessage;
	@NotEmpty
	private String objet;
	@Size(min=5)
	@NotEmpty
	private String texte;
	private Date date;
	@NotEmpty
	@Email
	private String emailDestinataire;
	@Email
	@NotEmpty
	private String emailEmeteur;
	private boolean lu;
	
	public boolean isLu() {
		return lu;
	}
	public void setLu(boolean lu) {
		this.lu = lu;
	}
	public Long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailDestinataire() {
		return emailDestinataire;
	}
	public void setEmailDestinataire(String emailDestinataire) {
		this.emailDestinataire = emailDestinataire;
	}
	public String getEmailEmeteur() {
		return emailEmeteur;
	}
	public void setEmailEmeteur(String emailEmeteur) {
		this.emailEmeteur = emailEmeteur;
	}
	public Message(String objet, String texte, String emailDestinataire, String emailEmeteur) {
		super();
		this.objet = objet;
		this.texte = texte;
		this.emailDestinataire = emailDestinataire;
		this.emailEmeteur = emailEmeteur;
		this.date = new Date();
	}

}
