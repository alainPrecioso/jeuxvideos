package beans;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Jeu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2528716634836196468L;
	private String nom;
	private String description;
	private String prix;
	private Date dateSortie;
	private String pays;
	private String connexion;
	private String mode;
	private Integer genreKey;
	private List<Integer> plateformeKey;
	private Genre genre;
	private List<String> plateformeValues;
	
	
	public String getNom() {
		return nom;
	}
	
	public void addPlateforme(String str) {
		this.plateformeValues.add(str);
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
	public String getPrix() {
		return prix;
	}
	public void setPrix(String string) {
		this.prix = string;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date date) {
		this.dateSortie = date;
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
	public Genre getGenre() {
		return genre;
	}
	public void setGenreValue(Genre genre) {
		this.genre = genre;
	}
	public List<String> getPlateformeValues() {
		return plateformeValues;
	}
	public void setPlateformeValues(List<String> plateformeValues) {
		this.plateformeValues = plateformeValues;
	}
	
}
