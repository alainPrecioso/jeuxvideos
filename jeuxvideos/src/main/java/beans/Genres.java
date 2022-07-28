package beans;


import java.io.Serializable;
import java.util.Map;

public class Genres implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1860212967680380767L;
	// Cr�ation des classes suivis de la m�thode getters et setters.
	// Accessibilit� de pr�f�rence en private.
	private Map<Integer, String> genres;
	
	
	public Map<Integer, String> getGenres() {
		return genres;
	}
	public void setGenres(Map<Integer, String> genres) {
		this.genres = genres;
	}

	
}
