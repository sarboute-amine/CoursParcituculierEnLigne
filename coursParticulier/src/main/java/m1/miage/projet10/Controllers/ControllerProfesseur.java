package m1.miage.projet10.Controllers;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import m1.miage.projet10.Metier.CoursParticulierMetier;

@Controller
@RequestMapping(value = "/prof")
public class ControllerProfesseur {

	@Autowired
	private CoursParticulierMetier metier;
	
	@RequestMapping(value = "/index")
	public String index(Locale locale, Model model) {	
		
		return "viewProfesseur/AccueilProf";
	}
	
	@RequestMapping(value = "/listeCours")
	public String  listeCours(Locale locale, Model model) {	
		
		return "viewProfesseur/ProflisteCours";
	}
	
	@RequestMapping(value = "/disponibilite")
	public String disponibilite(Locale locale, Model model) {	
		
		return "viewProfesseur/ProfDisponibilite";
	}
	@RequestMapping(value = "/compteRendu")
	public String compteRendu(Locale locale, Model model) {	
		
		return "viewProfesseur/ProfcompteRendu";
	}
	
	@RequestMapping(value = "/listeEleve")
	public String listeEleve(Locale locale, Model model) {	
		
		return "viewProfesseur/ProflistEleve";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "viewProfesseur/ProfMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "welcomPage";
	}

}
