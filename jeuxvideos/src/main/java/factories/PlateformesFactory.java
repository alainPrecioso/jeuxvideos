package factories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Genre;
import beans.Plateforme;
import sql.ConnexionFactory;

public class PlateformesFactory {

private static ArrayList<Plateforme> plateformes = null;
	
	
	private static void populate() {
		plateformes = new ArrayList<>();
		try {
			PreparedStatement ps = ConnexionFactory.getConnect().prepareStatement("SELECT * FROM plateforme");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				plateformes.add(new Plateforme(rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Plateforme> getPlateformes() {
		if (plateformes == null) {
			populate();
		}
		return plateformes;
		
	}
	
	
}
