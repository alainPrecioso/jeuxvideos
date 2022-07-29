package routing;

import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Jeu;
import factories.JeuFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sql.ConnexionFactory;

/**
 * Servlet implementation class EditJeuServlet
 */
@WebServlet("/editjeu")
public class EditJeuServlet extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -1199355475768679605L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EditJeuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Jeu> list = new ArrayList<>();
		try {
			System.out.println(request.getParameter("genre"));
			PreparedStatement ps = ConnexionFactory.getConnect()
					.prepareStatement("SELECT * FROM genre WHERE Genre_Titre = ?");
			ps.setString(1, request.getParameter("genre"));
			ResultSet rs = ps.executeQuery();
			rs.next();
			Integer genreKey= rs.getInt("Genre_Id");
			
			
			
			
			
			ps = ConnexionFactory.getConnect()
					.prepareStatement("UPDATE jeux SET Jeux_Description=?, Jeux_Prix =?, "
							+ "Jeux_DateSortie = ?, Genre_Id = ? WHERE  Jeux_Titre = ?");
			
			ps.setString(1, request.getParameter("description"));
			ps.setFloat(2, Float.parseFloat(request.getParameter("prix")));
			ps.setDate(3, Date.valueOf(request.getParameter("dateSortie")));
			ps.setInt(4, genreKey);
			ps.setString(5, request.getParameter("nom"));
			ps.executeUpdate();
			
			
			
			
			
			
			
			ps = ConnexionFactory.getConnect()
					.prepareStatement("SELECT * FROM jeux j LEFT JOIN genre g\r\n"
							+ "ON j.Genre_Id = g.Genre_Id\r\n"
							+ "LEFT JOIN jeuxplateforme jp\r\n"
							+ "ON j.Jeux_Id = jp.Jeux_Id\r\n"
							+ "LEFT JOIN plateforme p\r\n"
							+ "ON jp.Plateforme_Id = p.Plateforme_Id\r\n"
							+ "WHERE j.Jeux_Titre = ?\r\n"
							+ "ORDER BY j.Jeux_Titre");
			ps.setString(1, request.getParameter("nom"));
			
			list.add(JeuFactory.getJeu(ps.executeQuery()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		request.setAttribute("list", list);
		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
