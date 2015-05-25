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
 * Servlet implementation class BuscarHoraApsPorMedico
 */
@WebServlet(name = "BuscarHoraApsPorMedico", urlPatterns = { "/BuscarHoraApsPorMedico" })
public class BuscarHoraApsPorMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarHoraApsPorMedico() {
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
		String lista = "";
		Transformar t=new Transformar();		
		ServicioProxy s = new ServicioProxy();
		String medico = request.getParameter("idMedico");
		try{
		if(medico!=null||medico!=""){
			if(t.validarNumero(medico)){
		lista = s.obtenerHoraMedicaApsPorIdMedico(medico);
		request.setAttribute("rango", lista);
		getServletContext().getRequestDispatcher("/listaHoraMedicaAps.jsp")
		.forward(request, response);
			}else{
				lista = s.buscarHoraAPS();
				//	request.setAttribute("listaMedicos", lista);
				request.setAttribute("rango",lista);
					getServletContext().getRequestDispatcher("/listaHoraMedicaAps.jsp").forward(
							request, response);
			}
		}
		}catch(NumberFormatException e){
			lista = s.buscarHoraAPS();
			request.setAttribute("rango",lista);
				getServletContext().getRequestDispatcher("/listaHoraMedicaAps.jsp").forward(
						request, response);
		}
	}

}
