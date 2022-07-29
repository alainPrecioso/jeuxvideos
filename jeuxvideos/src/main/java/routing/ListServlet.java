package routing;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
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
 * Servlet implementation class ListServlet
 */
@WebServlet (urlPatterns = "/list")
public class ListServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4523322367565506445L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Jeu> list = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("0.00");
		String genre = null;
		String plateforme = null;
		
		String[] separated = request.getParameter("search").split("\\s(?=(?:\"[^\"]*\"|[^\"])*$)");
		String search = "%";
		
		List<String> searchList = new ArrayList<>();
		
//		for (String str : separated) {
//			search += str + "%";
//		}
		for (String str : separated) {
			searchList.add(str);
		}
		for (String str : searchList) {
			String[] sep = str.split(":");
			if (sep[0].equals("genre") || sep[0].equals("g")) {
				genre = sep[1];
				genre = genre.replace("\"", "");
				genre = "%" + genre + "%";
			} else if (sep[0].equals("plateforme") || sep[0].equals("pf")) {
				plateforme = sep[1];
				plateforme = plateforme.replace("\"", "");
				plateforme = "%" + plateforme + "%";
			} else {
				search += str + "%";
			}
			
		}
		
		
//		genre = request.getParameter("genres");
//		plateforme = request.getParameter("plateformes");
		
		
		
		if (genre == null) {
			genre = "%";
		} else if (genre.equals("genre") || genre.equals("")) {
			genre = "%";
		}
		if (plateforme == null ) {
			plateforme = "%";
		}else if (plateforme.equals("plateforme") || plateforme.equals("")) {
			plateforme = "%";
		}
		
		
		
		
		
		
		try {
//			PreparedStatement ps = ConnexionFactory.getConnect()
//					.prepareStatement("SELECT * FROM `jeuxvideo`.`jeux`");
			PreparedStatement ps = ConnexionFactory.getConnect()
					.prepareStatement("SELECT * FROM jeux j LEFT JOIN genre g\r\n"
							+ "ON j.Genre_Id = g.Genre_Id\r\n"
							+ "LEFT JOIN jeuxplateforme jp\r\n"
							+ "ON j.Jeux_Id = jp.Jeux_Id\r\n"
							+ "LEFT JOIN plateforme p\r\n"
							+ "ON jp.Plateforme_Id = p.Plateforme_Id\r\n"
							+ "WHERE g.Genre_Titre LIKE ? && p.Plateforme_Nom LIKE ? && j.Jeux_Titre LIKE ?\r\n"
							+ "ORDER BY j.Jeux_Titre");
			ps.setString(1, genre);
			ps.setString(2, plateforme);
			ps.setString(3, search);
			ResultSet rs = ps.executeQuery();
			if (!rs.next()) {
				request.setAttribute("result", "pas de résultats");
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				return;
			}
			
			
			while (!rs.isAfterLast()) {
				list.add(JeuFactory.getJeu(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		//HttpSession session = request.getSession();
		//session.setAttribute("list", list);
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
