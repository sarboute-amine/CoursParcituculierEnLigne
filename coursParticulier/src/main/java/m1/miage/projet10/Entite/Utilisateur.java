package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.Constraint;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.impl.EmailValidator;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeUtilisateur",
discriminatorType=DiscriminatorType.STRING,
length=5)
public abstract class Utilisateur implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	@NotEmpty
	private String nom;
	@NotEmpty
	private String prenom;
	@NotEmpty
	@DateTimeFormat
	private Date dateNaissance;
	@NotEmpty
	private String adresse;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String telephone;
	@NotEmpty
	private String motDePasse;
	@Enumerated
	private Niveau niveau;
	@OneToMany
	@JoinTable(name="User_Message",
	joinColumns = @JoinColumn(name="idUser"),
	inverseJoinColumns = @JoinColumn(name="idMessage"))
	Collection<Message> listsMessage;
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String adresse, String email, String telephone,
			String motDePasse, Niveau niveau) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.motDePasse = motDePasse;
		this.niveau = niveau;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	public Collection<Message> getListsMessage() {
		return listsMessage;
	}
	public void setListsMessage(Collection<Message> listsMessage) {
		this.listsMessage = listsMessage;
	}
	
}
