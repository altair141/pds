package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utilitario.Transformar;
import capaServicio.ServicioProxy;

/**
 * Servlet implementation class BuscarMedico
 */
public class BuscarMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarMedico() {
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
		ServicioProxy s = new ServicioProxy();
		Transformar t = new Transformar();
		String medico = request.getParameter("busqueda");
		String especialidad = request.getParameter("especialidad");
		String lista = "";
		if (medico == null && especialidad == null) {
			lista = s.obtenerMedicos();
			request.setAttribute("listaMedicos", lista);
			getServletContext().getRequestDispatcher("/listaMedicos.jsp")
					.forward(request, response);
		} else if (medico == null && especialidad != null) {
			if (t.validarNumero(especialidad)) {
				lista = s.obtenerMedicosDeUnEspecialidad(especialidad);
				request.setAttribute("listaMedicos", lista);
				getServletContext().getRequestDispatcher("/listaMedicos.jsp")
						.forward(request, response);
			} else {
				lista = s.obtenerMedicos();
				request.setAttribute("listaMedicos", lista);
				getServletContext().getRequestDispatcher("/listaMedicos.jsp")
						.forward(request, response);
			}
		}else if(medico!=null && especialidad==null){
			lista=s.buscarMedicoPorTexto(medico);
			request.setAttribute("listaMedicos", lista);
			getServletContext().getRequestDispatcher("/listaMedicos.jsp")
					.forward(request, response);
		}

	}

}
