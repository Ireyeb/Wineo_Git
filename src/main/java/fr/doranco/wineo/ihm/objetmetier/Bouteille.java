package fr.doranco.wineo.ihm.objetmetier;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Bouteille implements Serializable {

	private String designation;
	private BigDecimal contenance;
	private String couleur;
	private String region;
	private Integer annee;
	private Boolean bio;

	public Bouteille() {
		super();
	}

	public Bouteille(String designation, BigDecimal contenance, String couleur, String region, Integer annee,
			Boolean bio) {
		super();
		this.designation = designation;
		this.contenance = contenance;
		this.couleur = couleur;
		this.region = region;
		this.annee = annee;
		this.bio = bio;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getContenance() {
		return contenance;
	}

	public void setContenance(BigDecimal contenance) {
		this.contenance = contenance;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Boolean getBio() {
		return bio;
	}

	public void setBio(Boolean bio) {
		this.bio = bio;
	}

}
