package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utilitario.Transformar;
import capaServicio.ServicioProxy;

/**
 * Servlet implementation class BuscarHoraMedicaAps
 */
@WebServlet(name = "BuscarHoraMedicaAps", urlPatterns = { "/BuscarHoraMedicaAps" })
public class BuscarHoraMedicaAps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarHoraMedicaAps() {
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
		String fechaInicio = request.getParameter("fechaIni");
		String fechaFin = request.getParameter("fechaFin");
		String idMedico = request.getParameter("busquedaMedico");
		ServicioProxy s = new ServicioProxy();
		Transformar t = new Transformar();
		if (idMedico != null
				&& ((fechaInicio == null || fechaInicio == null) || (fechaInicio == null && fechaInicio == null))) {
			// busqueda por medico
			if (t.validarNumero(idMedico)) {
				String medico = s.buscarHoraAPSPorMedico(idMedico);
				if (medico == null) {
					medico = "no encontrado";
				}
				request.setAttribute("rango", medico);
				
			}

		} else if (idMedico == null
				&& ((fechaInicio != null || fechaInicio != null) || (fechaInicio != null && fechaInicio != null))) {
			// busqueda por rango
			
			if (t.validarFecha(fechaInicio) && t.validarFecha(fechaFin)) {
				String rango = s.buscarHoraAPSPorRango(fechaInicio, fechaFin);											
				request.setAttribute("rango", rango);				
			}
			
		} else {
			String rango = null;
			request.setAttribute("rango", rango);
		}

		getServletContext().getRequestDispatcher("/listaHoraMedicaAps.jsp")
				.forward(request, response);
	}

}
