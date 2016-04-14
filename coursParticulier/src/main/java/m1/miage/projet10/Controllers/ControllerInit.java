package m1.miage.projet10.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Utilisateur;

@Controller
@RequestMapping(value="/")
public class ControllerInit {

	@RequestMapping(value="/")
	public String index(Model model)
	{
		
		return "welcomPage";
	}
	
}
