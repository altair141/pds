package servlets;

import gestionDatos.TransformarJSon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import capaServicio.ServicioProxy;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("user");
		String pwd = request.getParameter("password");

		ServicioProxy login = new ServicioProxy();
		String logeo = login.login(user, pwd);
		try {
			if (logeo != null || !logeo.isEmpty()) {
				TransformarJSon datoslogeo=new TransformarJSon();
				String[][] matriz=datoslogeo.datosLogin(logeo);
				for(int i=0;i<matriz[0].length;i++){
				request.setAttribute("id", matriz[0][i]);
				request.setAttribute("nombre", matriz[1][i]);
				request.setAttribute("nombreUsuario", matriz[2][i]);
				request.setAttribute("tipoUsuario", matriz[3][i]);
				getServletContext().getRequestDispatcher("/acceso.jsp").forward(
	                    request, response);
			}
			}else{
				
				response.sendRedirect("login.jsp");
			}
				
			
		} catch (NullPointerException e) {
			request.setAttribute("userMalo", "Usuario o clave incorrecto");
			getServletContext().getRequestDispatcher("/login.jsp").forward(
                    request, response);
		}

	}

}
