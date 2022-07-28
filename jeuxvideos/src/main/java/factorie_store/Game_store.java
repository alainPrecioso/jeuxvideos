package factorie_store;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import beans.Genre;
import beans.Jeu;
import beans.Plateforme;
// Création de la classe Game_store.
public class Game_store {
// TODO Auto-generated constructor stub
	
// Création d'un nouveau jeu depuis la Bdd. 	
public static Jeu getJeu(ResultSet rs) throws SQLException  {
	List<Plateforme> listpf = new ArrayList<>();
	Integer trackID = rs.getInt(1);
	DecimalFormat df = new DecimalFormat("0.00");
	Jeu jeu = new Jeu();
	jeu.setNom(rs.getString("Jeux_Titre"));
	jeu.setDescription(rs.getString("Jeux_Description"));
	jeu.setPrix(df.format(rs.getFloat("Jeux_Prix")));
	jeu.setDateSortie(rs.getDate("Jeux_DateSortie"));
	jeu.setPays(rs.getString("Jeux_PaysOrigine"));
	jeu.setConnexion(rs.getString("Jeux_Connexion"));
	jeu.setMode(rs.getString("Jeux_Mode"));
	jeu.setGenreValue(new Genre(rs.getString("Genre_Titre"), rs.getString("Genre_Description")));
	jeu.setPlateformes(listpf);
	while(trackID == rs.getInt(1) && rs.next()) {
		jeu.addPlateforme(new Plateforme(rs.getString("Plateforme_Nom"), rs.getString("Plateforme_Description")));
	}
		return jeu;
}
	}
	
	

	
	


