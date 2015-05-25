package servlets;

import gestionDatos.TransformarJSon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utilitario.Transformar;
import capaServicio.ServicioProxy;

/**
 * Servlet implementation class GenerarReporteBox
 */
@WebServlet(name = "GenerarReporteBox", urlPatterns = { "/GenerarReporteBox" })
public class GenerarReporteBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerarReporteBox() {
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
		
String idBox = request.getParameter("busquedaBox");
		String box="";
		String fechaInicio = "";
		String fechaTermino = "";
		try{
			fechaInicio = request.getParameter("fechaInicioBox");	
		}catch(NullPointerException e){
			fechaInicio ="";
		}
		try{
			 fechaTermino = request.getParameter("fechaTerminoBox");	
		}catch(NullPointerException e){
			fechaTermino = "";
		}
		int idBoxBuscar = 0;
		String lista = "";
		
		Transformar t = new Transformar();
		ServicioProxy s = new ServicioProxy();
		try {
			if (t.validarNumero(idBox)) {
				idBoxBuscar = t.StringToInt(idBox);
			} else {
				idBoxBuscar = 0;
			}
		} catch (NumberFormatException e) {
			idBoxBuscar = 0;
		}
		// busqueda por todos los campos fechas y box
		if (fechaTermino != "" && fechaInicio != "" && idBoxBuscar != 0) {
			if (t.validarFecha(fechaInicio) && t.validarFecha(fechaTermino)) {
				try {
					lista =s.obtenerPorcentajeOcupacionBoxPorBox(idBox,fechaInicio, fechaTermino); 
					box=s.obtenerBoxPorId(idBox);
					
				} catch (NullPointerException e) {
					lista = null;
				}				
				if (lista == null) {
					lista="no encontrado";
				}
				String[][] matriz = TransformarJSon.datosBox(lista);
				String [][]matriz2=TransformarJSon.box(box);
				request.setAttribute("nombreBox", matriz2[1][0]);
				request.setAttribute("porcentaje", matriz[1][0]);
				
				request.setAttribute("lista", lista);
				getServletContext().getRequestDispatcher(
						"/generarReporteBox.jsp")
						.forward(request, response);

			} else {
				
			}
		}// busqueda por fecha
		else if (fechaTermino != "" && fechaInicio != ""
				&& idBoxBuscar == 0) {
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
				
				getServletContext().getRequestDispatcher(
						"/generarReporteBox.jsp")
						.forward(request, response);
			}else{
				getServletContext().getRequestDispatcher(
						"/generarReporteBox.jsp")
						.forward(request, response);
			}
			

		}// busqueda por medico
		else if (fechaTermino == "" && fechaInicio == ""
				&& idBoxBuscar!= 0) {			
			
			if(idBoxBuscar != 0){
				getServletContext().getRequestDispatcher(
						"/generarReporteBox.jsp")
						.forward(request, response);
			}else{
				getServletContext().getRequestDispatcher(
						"/generarReporteBox.jsp")
						.forward(request, response);
			}
			

		} else {
			getServletContext().getRequestDispatcher(
					"/generarReporteBox.jsp")
					.forward(request, response);
		}
		
	}

}
