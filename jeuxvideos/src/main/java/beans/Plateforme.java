package beans;

public class Plateforme {
	// Création des classes suivis de la méthode getters et setters.
	// Accessibilité de préférence en private.
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
