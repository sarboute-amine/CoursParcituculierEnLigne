package m1.miage.projet10.Controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Metier.InterfaceELeve;


@Controller
@RequestMapping(value = "/Eleve")
public class ControlleurEleve {

	@Autowired
	private InterfaceELeve service;
	
	@RequestMapping(value = "/index")
	public String index(Locale locale, Model model) {	
		
		return "viewEleve/AccueilEleve";
	}
	@RequestMapping(value = "/listeCours")
	public String  listeCours(Locale locale, Model model) {	
		
		return "viewEleve/ElevelisteCours";
	}
	
	@RequestMapping(value = "/listeProf")
	public String  listeProf(Locale locale, Model model) {	
		
		return "viewEleve/ElevelisteProf";
	}
	
	@RequestMapping(value = "/espace")
	public String espace(Locale locale, Model model) {	
		
		return "viewEleve/EleveEspace";
	}
	@RequestMapping(value = "/inscrire")
	public String inscrire(Locale locale, Model model) {	
		
		model.addAttribute("Eleve", new Eleve());
		
		return "viewEleve/EleveInscrire";
	}
	@RequestMapping(value = "/acheter")
	public String acheter(Locale locale, Model model) {	
		
		return "viewEleve/EleveAcheter";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "viewEleve/EleveMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "welcomPage";
	}
}

