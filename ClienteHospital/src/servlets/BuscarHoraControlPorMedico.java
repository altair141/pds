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
 * Servlet implementation class BuscarHoraControlPorMedico
 */
@WebServlet(name = "BuscarHoraControlPorMedico", urlPatterns = { "/BuscarHoraControlPorMedico" })
public class BuscarHoraControlPorMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarHoraControlPorMedico() {
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
		String lista = "";
		Transformar t=new Transformar();		
		ServicioProxy s = new ServicioProxy();
		String medico = request.getParameter("idMedico");
		try{
		if(medico!=null||medico!=""){
			if(t.validarNumero(medico)){
		lista = s.obtenerHoraMedicaControlPorIdMedico(medico);
		request.setAttribute("rango", lista);
		getServletContext().getRequestDispatcher("/listaHoraMedicaControl.jsp")
		.forward(request, response);
			}else{
				lista = s.buscarHoraControl();
				//	request.setAttribute("listaMedicos", lista);
				request.setAttribute("rango",lista);
					getServletContext().getRequestDispatcher("/listaHoraMedicaControl.jsp").forward(
							request, response);
			}
		}
		}catch(NumberFormatException e){
			lista = s.buscarHoraControl();
			request.setAttribute("rango",lista);
				getServletContext().getRequestDispatcher("/listaHoraMedicaControl.jsp").forward(
						request, response);
		}
	}

}
