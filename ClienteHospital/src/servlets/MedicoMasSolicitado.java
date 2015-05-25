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
 * Servlet implementation class MedicoMasSolicitado
 */
@WebServlet(name = "MedicoMasSolicitado", urlPatterns = { "/MedicoMasSolicitado" })
public class MedicoMasSolicitado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicoMasSolicitado() {
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
		Transformar t=new Transformar();
		String fechaIni=request.getParameter("fechaInicioMedi");
		String fechaFin=request.getParameter("fechaTerminoMedi");
		String lista="";
		try{
		if(t.validarFecha(fechaIni)&&t.validarFecha(fechaFin)){
			lista=s.obtenerMedicosMasSolicitado(fechaIni, fechaFin);
		}
		}catch(NullPointerException e){
			lista=null;
		}
		if(lista==null||lista==""){
			lista="no encontrado";
			request.setAttribute("nombreMedico",lista);
			getServletContext().getRequestDispatcher("/medicoMasSolicitado.jsp").forward(
					request, response);
		}else{
		try{
		String [][]matriz=TransformarJSon.medicoMas(lista);
	
			request.setAttribute("nombreMedico", matriz[1][0]);	
		
		
		getServletContext().getRequestDispatcher("/medicoMasSolicitado.jsp").forward(
				request, response);
		}catch(ArrayIndexOutOfBoundsException e){
			lista="no encontrado";
			request.setAttribute("nombreMedico",lista);
			getServletContext().getRequestDispatcher("/medicoMasSolicitado.jsp").forward(
					request, response);
		}
		}
	}

}
