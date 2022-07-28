package lien;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Jeu;

/**
 * Servlet implementation class Servletlistjeuxvideo
 */
@WebServlet("/Servletlistjeuxvideo")
public class Servletlistjeuxvideo extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletlistjeuxvideo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public jakarta.servlet.ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//jeux.getWriter();
		//Création d'une nouvelle liste
		ArrayList<Jeu>list=new ArrayList<>();
		DecimalFormat df = new DecimalFormat("0.00");
		try {
			
		
			PreparedStatement ps = ConnexionFactory.getConnect()
					.prepareStatement("SELECT * FROM `jeuxvideo`.`jeux`");
			ResultSet rs = ps.executeQuery();
			rs.next();
			while (!rs.isAfterLast()) {
				Jeu jeu = new Jeu();
				jeu.setNom(rs.getString(2));
				jeu.setDescription(rs.getString(3));
				jeu.setPrix(df.format(rs.getFloat(4)));
				list.add(jeu);
				rs.next();
				  
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
