package servlets;

import gestionDatos.TransformarJSon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import capaServicio.ServicioProxy;

/**
 * Servlet implementation class PacienteMasAtendido
 */
@WebServlet(name = "PacienteMasAtendido", urlPatterns = { "/PacienteMasAtendido" })
public class PacienteMasAtendido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteMasAtendido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicioProxy s=new ServicioProxy();
		
		String lista=s.pacienteMasUtiliza();
		
		String[][] matriz=TransformarJSon.datosPaciente(lista);
		request.setAttribute("idPaciente", matriz[0][0]);
		request.setAttribute("nombre", matriz[1][0]);
		
		getServletContext().getRequestDispatcher("/pacienteMasAtendido.jsp")
		.forward(request, response);
	}

}
