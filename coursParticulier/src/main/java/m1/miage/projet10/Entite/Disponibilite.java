package m1.miage.projet10.Entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Disponibilite implements  Serializable{
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDisponibilite;
	@DateTimeFormat
	private Date date;
	public Long getIdDisponibilite() {
		return idDisponibilite;
	}
	public void setIdDisponibilite(Long idDisponibilite) {
		this.idDisponibilite = idDisponibilite;
	}
	@NotEmpty
	private String heureDebut;
	@NotEmpty
	private String heureFin;
	
	public Long getPrix() {
		return idDisponibilite;
	}
	public void setPrix(Long idDisponibilite) {
		this.idDisponibilite = idDisponibilite;
	}
	public Disponibilite(Date date, String heureDebut, String heureFin) {
		super();
		this.date = date;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}