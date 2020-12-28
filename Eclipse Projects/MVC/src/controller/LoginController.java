package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Login;
import service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")		//URL Pattern 
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
			//Login check 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//Logic to check username and password. 	Create Login Account 
		Login ll = new Login();
		ll.setUser(request.getParameter("user"));
		ll.setPass(request.getParameter("pass"));
		
		LoginService ls  = new LoginService();
		String result = ls.checkUser(ll);
		
		if(result.equals("Success")) {
			response.sendRedirect("Success.jsp");
		}else {
			response.sendRedirect("Failure.jsp");
		}
	}

}
