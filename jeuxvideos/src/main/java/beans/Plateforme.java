package beans;

public class Plateforme {
	// Cr�ation des classes suivis de la m�thode getters et setters.
	// Accessibilit� de pr�f�rence en private.
	private String Nom;
	private String Description;
	
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
