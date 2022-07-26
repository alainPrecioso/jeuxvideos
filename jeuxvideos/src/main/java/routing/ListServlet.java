package routing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Jeu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		Jeu jeu = new Jeu();
		jeu.setNom("tetris");
		jeu.setDescription("des briques tombent");
		
		Jeu jeu2 = new Jeu();
		jeu2.setNom("mario");
		jeu2.setDescription("casse des briques");
		list.add(jeu);
		list.add(jeu2);
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
