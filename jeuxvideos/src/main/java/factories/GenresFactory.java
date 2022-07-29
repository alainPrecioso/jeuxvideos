package factories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Genre;
import sql.ConnexionFactory;

public class GenresFactory {

	private static ArrayList<Genre> genres = null;
	
	
	private static void populate() {
		genres = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionFactory.getConnect().prepareStatement("SELECT * FROM genre");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				genres.add(new Genre(rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Genre> getGenres() {
		if (genres == null) {
			populate();
		}
		return genres;
		
	}
	
	
	
	
	
	
	
	
}
