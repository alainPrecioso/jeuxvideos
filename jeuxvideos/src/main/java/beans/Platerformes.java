package beans;

import java.io.Serializable;

public class Platerformes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1145773800165425292L;
	// Cr�ation des classes suivis de la m�thode getters et setters.
	// Accessibilit� de pr�f�rence en private.
	private String nom;
	private String description;

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
}
