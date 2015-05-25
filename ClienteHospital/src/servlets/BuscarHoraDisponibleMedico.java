package servlets;

import gestionDatos.TransformarJSon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import capaServicio.ServicioProxy;
import Utilitario.Transformar;

/**
 * Servlet implementation class BuscarHoraDisponibleMedico
 */
@WebServlet(name = "BuscarHoraDisponibleMedico", urlPatterns = { "/BuscarHoraDisponibleMedico" })
public class BuscarHoraDisponibleMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarHoraDisponibleMedico() {
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
		String idMedico = request.getParameter("busquedaMedico");
		
		String fechaInicio = "";
		String fechaTermino = "";
		try{
			fechaInicio = request.getParameter("fechaInicioDisponible");	
		}catch(NullPointerException e){
			fechaInicio ="";
		}
		try{
			 fechaTermino = request.getParameter("fechaTerminoDisponible");	
		}catch(NullPointerException e){
			fechaTermino = "";
		}
		int idMedicoDisponible = 0;
		String lista = "";
		String medico = "";
		Transformar t = new Transformar();
		ServicioProxy s = new ServicioProxy();
		try {
			if (t.validarNumero(idMedico)) {
				idMedicoDisponible = t.StringToInt(idMedico);
			} else {
				idMedicoDisponible = 0;
			}
		} catch (NumberFormatException e) {
			idMedicoDisponible = 0;
		}
		// busqueda por todos los campos fechas y medico
		if (fechaTermino != "" && fechaInicio != "" && idMedicoDisponible != 0) {
			if (t.validarFecha(fechaInicio) && t.validarFecha(fechaTermino)) {
				try {
					lista = s.buscarSuDisponbilidadHoraPorFechaMedico(idMedico,
							fechaInicio, fechaTermino);
				} catch (NullPointerException e) {
					lista = null;
				}
				try {
					medico = s.obtenerMedicoPorId(idMedico);

				} catch (NullPointerException e) {
					medico = null;
				}

				if (lista == null) {
					lista = "no encontrado";
				}
				String[][] matriz = TransformarJSon.datosMedico(medico);
				request.setAttribute("idMedico", matriz[0][0]);
				request.setAttribute("nombreMedico", matriz[1][0]);
				request.setAttribute("apellidoMedico", matriz[2][0]);
				request.setAttribute("especialidadMedico", matriz[4][0]);
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);

			} else {
				lista = "no encontrado";
				request.setAttribute("idMedico", idMedico);
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);
			}
		}// busqueda por fecha
		else if (fechaTermino != "" && fechaInicio != ""
				&& idMedicoDisponible == 0) {
			if (t.validarFecha(fechaInicio) && t.validarFecha(fechaTermino)) {
				try{
				lista = s.buscarSuDisponbilidadHoraPorFecha(fechaInicio,
						fechaTermino);
				}catch(NullPointerException e){
					lista=null;
				}
				if(lista==null){
					lista="no encontrado";
				}
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);
				
			}else{
				lista = "no encontrado";				
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);
			}
			

		}// busqueda por medico
		else if (fechaTermino == "" && fechaInicio == ""
				&& idMedicoDisponible != 0) {			
			
			if(idMedicoDisponible != 0){
				
				lista=s.buscarSuDisponbilidadHoraMedico(idMedico);
				medico = s.obtenerMedicoPorId(idMedico);
				String[][] matriz = TransformarJSon.datosMedico(medico);
				request.setAttribute("idMedico", matriz[0][0]);
				request.setAttribute("nombreMedico", matriz[1][0]);
				request.setAttribute("apellidoMedico", matriz[2][0]);
				request.setAttribute("especialidadMedico", matriz[4][0]);
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);
			}else{
				lista = "no encontrado";				
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/listaHorasDisponibles.jsp")
						.forward(request, response);
			}
			

		} else {
			lista = "no encontrado";				
			request.setAttribute("lista", lista);
			getServletContext().getRequestDispatcher(
					"/listaHorasDisponibles.jsp")
					.forward(request, response);
		}

	}

}
