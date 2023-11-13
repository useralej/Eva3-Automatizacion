package mauricio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mauricio.bean.MauricioBean;
import mauricio.dao.MauricioDao;

/**
 * Servlet implementation class MauricioServlet
 */
public class MauricioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MauricioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MauricioDao loginDao = new MauricioDao();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		MauricioBean loginBean = new MauricioBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		
		if (loginDao.validate(loginBean))
		{
			HttpSession session = request.getSession();
		    session.setAttribute("user",username);
		   
		
			response.sendRedirect("principal.jsp");
			
			
		}
		else 
		{
			//HttpSession session = request.getSession();
			response.sendRedirect("index.jsp");
			
		}
		
	}


}
