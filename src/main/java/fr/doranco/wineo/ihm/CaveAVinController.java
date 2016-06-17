package fr.doranco.wineo.ihm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.doranco.wineo.ihm.objetmetier.CaveAVin;

@ManagedBean
@SessionScoped
public class CaveAVinController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<CaveAVin> caves;
	private Integer i=0;
	
	private CaveAVin maNouvelleCave;
	
	public CaveAVinController(){
		super ();
		
		maNouvelleCave = new CaveAVin();
		
		caves = new ArrayList<>();
		
	}

	public String ajouterNouvelleCave(){
		this.caves.add(maNouvelleCave);
		i++;
		maNouvelleCave = new CaveAVin();
		return "index";
	}

	public List<CaveAVin> getCaves() {
		return caves;
	}

	public void setCaveAVin(List<CaveAVin> caves) {
		this.caves = caves;
	}

	public CaveAVin getMaNouvelleCave() {
		return maNouvelleCave;
	}

	public void setMaNouvelleCave(CaveAVin maNouvelleCave) {
		this.maNouvelleCave = maNouvelleCave;
	}

}
