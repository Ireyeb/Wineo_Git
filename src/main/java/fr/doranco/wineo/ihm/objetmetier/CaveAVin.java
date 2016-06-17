package fr.doranco.wineo.ihm.objetmetier;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.doranco.wineo.ihm.BouteilleController;

@ManagedBean
@SessionScoped
public class CaveAVin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String caveName;
	private BigDecimal caveTemperature;
	private Integer quantiteMax;
	private List<Bouteille> bouteilles;
	
	public CaveAVin() {
		super();
		bouteilles = new ArrayList<>();
	}

	public CaveAVin(String caveName, BigDecimal caveTemperature, Integer quantiteMax, Integer placement) {
		super();
		
		bouteilles = new ArrayList<>();
		
		this.caveName = caveName;
		this.caveTemperature = caveTemperature;
		this.quantiteMax = quantiteMax;
		
	}

	public String getCaveName() {
		return caveName;
	}
	
	public void setCaveName(String caveName) {
		this.caveName = caveName;
	}
	
	public BigDecimal getCaveTemperature() {
		return caveTemperature;
	}
	
	public void setCaveTemperature(BigDecimal caveTemperature) {
		this.caveTemperature = caveTemperature;
	}
	
	public Integer getQuantiteMax() {
		return quantiteMax;
	}
	
	public void setQuantiteMax(Integer quantiteMax) {
		this.quantiteMax = quantiteMax;
	}
	


	public Integer getQuantite() {
		return this.getBouteilles().size();
	}

	public List<Bouteille> getBouteilles() {
		return bouteilles;
	}

	public void setBouteilles(List<Bouteille> bouteilles) {
		this.bouteilles = bouteilles;
	}
	
}
