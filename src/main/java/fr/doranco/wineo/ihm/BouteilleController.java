package fr.doranco.wineo.ihm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.doranco.wineo.ihm.objetmetier.Bouteille;
import fr.doranco.wineo.ihm.objetmetier.CaveAVin;

@ManagedBean
@SessionScoped
public class BouteilleController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private CaveAVin maCave;
	
	private Bouteille maNouvelleBouteille;
	
	
	public BouteilleController(){
		super ();
		
		maNouvelleBouteille = new Bouteille();
	}

	public String ajouterNouvelleBouteille(){
		maCave.getBouteilles().add(maNouvelleBouteille);
		maNouvelleBouteille = new Bouteille();
		return "caveContenu";
	}
	
	public String backToCave(){
		return "index";
	}

	public Bouteille getMaNouvelleBouteille() {
		return maNouvelleBouteille;
	}

	public void setMaNouvelleBouteille(Bouteille maNouvelleBouteille) {
		this.maNouvelleBouteille = maNouvelleBouteille;
	}
	
	
}
