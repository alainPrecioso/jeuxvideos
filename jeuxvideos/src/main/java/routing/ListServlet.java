package routing;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import beans.Jeu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sql.ConnexionFactory;

/**
 * Servlet implementation class ListServlet
 */
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
