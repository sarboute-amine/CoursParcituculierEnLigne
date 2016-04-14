package m1.miage.projet10.Controllers;

import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Metier.CoursParticulierMetier;
import m1.miage.projet10.Metier.InterfaceAdministrateur;

@Controller
@RequestMapping(value = "/admin")
public class ControllerAdministrateur{

	@Autowired // demander à spring de chercher un objet qui implements l'interface 
	private InterfaceAdministrateur service;
	
	@RequestMapping(value = "/index")
	public String home(Locale locale, Model model) {	
		
		return "viewAdministrateur/AccueilAdmin";
	}
	
	@RequestMapping(value = "/AjouterProf")
	public String inscrire(Locale locale, Model model) {	
		
		model.addAttribute("prof", new Professeur());
		
		return "viewAdministrateur/AdminAjouterProf";
	}
	
	@RequestMapping(value = "/AjouterProfbase")
	public String inscrirEleve(@ModelAttribute Professeur user,Locale locale, Model model) {
		
		service.addProf(user);
		model.addAttribute("listeProf", service.getListProf());
		return "viewAdministrateur/AdminlisteProf";
	}
	
	@RequestMapping(value = "/listeProf")
	public String  listeProf(Locale locale, Model model) {	
		model.addAttribute("listeProf", service.getListProf());
		return "viewAdministrateur/AdminlisteProf";
	}

	@RequestMapping(value = "/sup" )
	public String  supprimer(Long id ,Locale locale, Model model) {
		
	    
	    model.addAttribute("supprime",service.supprimerProf(id));
		model.addAttribute("listeProf",  service.getListProf());
		return "viewAdministrateur/AdminlisteProf";
	    
	}
	
	
	@RequestMapping(value = "/matier")
	public String compteRendu(Locale locale, Model model) {	
		
		return "viewAdministrateur/AdminMatier";
	}
	
	@RequestMapping(value = "/listeEleve")
	public String listEleve(Locale locale, Model model) {	
		
		model.addAttribute("listeEleve",  service.getListEleve());
		return "viewAdministrateur/AdminlistEleve";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "viewAdministrateur/AdminMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "welcomPage";
	}
}

