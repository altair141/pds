package servlets;

import gestionDatos.TransformarJSon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import capaServicio.ServicioProxy;

/**
 * Servlet implementation class ReservarHoraAps
 */
public class ReservarHoraAps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservarHoraAps() {
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
		String nombrePaciente=request.getParameter("paciente");		
		String hora=request.getParameter("horaMedica");
		
		if((nombrePaciente!=null )&&( hora!=null )){
			ServicioProxy s=new ServicioProxy();
			
			String reserva=s.reservarHoraAps(hora, nombrePaciente);
			
			String[][] mensaje=TransformarJSon.reserva(reserva);
			request.setAttribute("mensaje", reserva);
			 request.setAttribute("reserva", mensaje[0][0]);
			 getServletContext().getRequestDispatcher("/reservarHoraAps.jsp").forward(
	                 request, response);
			
		}
		
		
		
		
	}

}
