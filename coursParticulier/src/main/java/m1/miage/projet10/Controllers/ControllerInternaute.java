package m1.miage.projet10.Controllers;

import java.lang.reflect.Method;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Utilisateur;
import m1.miage.projet10.Metier.InterfaceInternaute;

@Controller
@RequestMapping(value="/internaute")
public class ControllerInternaute {

	@Autowired
	private InterfaceInternaute service;
	
	@RequestMapping(value="/inscrire")
	public String inscrirEleve(@ModelAttribute("Eleve") @Valid Eleve user, BindingResult br , Model model) {
		
		if(br.hasErrors())
			return "inscrire";
		service.inscrire(user);
		model.addAttribute("Eleve", new Eleve());
		
		return "viewEleve/AccueilEleve";
	}
	
	@RequestMapping(value="/connexion", method= RequestMethod.POST)
	public String connexion(@ModelAttribute Utilisateur user, Locale local, Model model) 
	{
		System.err.println("erreur");
		
		return "viewEleve/AccueilEleve";
	}
	
}
