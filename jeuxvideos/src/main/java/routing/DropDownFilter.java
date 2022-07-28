package routing;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Genre;
import beans.Plateforme;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import sql.ConnexionFactory;

/**
 * Servlet Filter implementation class DropDownFilter
 */
@WebFilter(filterName="/DropDownFilter", urlPatterns="/*")
public class DropDownFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9175337503679369744L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DropDownFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		List<Genre> genres = new ArrayList<>();
		List<Plateforme> plateformes = new ArrayList<>();
		PreparedStatement ps;
		try {
			ps = ConnexionFactory.getConnect().prepareStatement("SELECT * FROM genre");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				genres.add(new Genre(rs.getString(2), rs.getString(3)));
			}

		
			ps = ConnexionFactory.getConnect().prepareStatement("SELECT * FROM plateforme");
			rs = ps.executeQuery();
			while (rs.next()) {
				plateformes.add(new Plateforme(rs.getString(2), rs.getString(3)));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((HttpServletRequest) request).setAttribute("genres", genres);
		((HttpServletRequest) request).setAttribute("plateformes", plateformes);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
