package beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Jeu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2528716634836196468L;
	private String nom;
	private String description;
	private Double prix;
	private LocalDate dateSortie;
	private String pays;
	private String connexion;
	private String mode;
	private Integer genreKey;
	private List<Integer> plateformeKey;
	private String genreValue;
	private List<String> plateformeValues;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public LocalDate getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getConnexion() {
		return connexion;
	}
	public void setConnexion(String connexion) {
		this.connexion = connexion;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Integer getGenreKey() {
		return genreKey;
	}
	public void setGenreKey(Integer genreKey) {
		this.genreKey = genreKey;
	}
	public List<Integer> getPlateformeKey() {
		return plateformeKey;
	}
	public void setPlateformeKey(List<Integer> plateformeKey) {
		this.plateformeKey = plateformeKey;
	}
	public String getGenreValue() {
		return genreValue;
	}
	public void setGenreValue(String genreValue) {
		this.genreValue = genreValue;
	}
	public List<String> getPlateformeValues() {
		return plateformeValues;
	}
	public void setPlateformeValues(List<String> plateformeValues) {
		this.plateformeValues = plateformeValues;
	}
	
}
