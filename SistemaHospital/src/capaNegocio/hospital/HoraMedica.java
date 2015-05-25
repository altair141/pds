package capaNegocio.hospital;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

import utilitario.Transformar;
import capaNegocio.personas.Medico;
import capaNegocio.personas.Paciente;
import capaNegocio.personas.Persona;

public class HoraMedica {

	private int id;
	private boolean aps;
	private Date fecha;
	private Box box;
	private Medico medico;
	private Paciente paciente;
	private Persona personaRegistra;

	public HoraMedica() {
		// TODO Auto-generated constructor stub
	}

	public HoraMedica(int id, boolean aps, Date fecha, Box box, Medico medico,
			Paciente paciente, Persona personaRegistra) {
		super();
		this.id = id;
		this.aps = aps;
		this.fecha = fecha;
		this.box = box;
		this.medico = medico;
		this.paciente = paciente;
		this.personaRegistra = personaRegistra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAps() {
		return aps;
	}

	public void setAps(boolean aps) {
		this.aps = aps;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Box getBox() {
		return box;
	}

	public void setBox(Box box) {
		this.box = box;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Persona getPersonaRegistra() {
		return personaRegistra;
	}

	public void setPersonaRegistra(Persona personaRegistra) {
		this.personaRegistra = personaRegistra;
	}
	// ------------------------------------------------------------------------------------------------------------------
	
	
	public String buscarHoraAps() {

		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		try {
			

			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);
				
			for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
				this.aps = esAps(horaMedicaOrm.getAsp());
				// hay que probar que funcione
				if (aps == true) {
					
					 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
					String fecha = obtenerFecha(horaMedicaOrm.getFecha());
					String hora = obtenerHora(horaMedicaOrm.getFecha());
					obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
					obj.put("fechaHoraMedica", fecha);
					obj.put("horaHoraMedica", hora);
					obj.put("nombreMedico",medico.getIdPersona().getNombre());
					obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
			}
			
			
		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}
	
	// ------------------------------------------------------------------------------------------------------------------
	
	
		public String buscarHoraControl() {

			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "";
			try {
				

				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);
					
				for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
					this.aps = esAps(horaMedicaOrm.getAsp());
					// hay que probar que funcione
					if (aps == false) {
						
						 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
						String fecha = obtenerFecha(horaMedicaOrm.getFecha());
						String hora = obtenerHora(horaMedicaOrm.getFecha());
						obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
						obj.put("fechaHoraMedica", fecha);
						obj.put("horaHoraMedica", hora);
						obj.put("nombreMedico",medico.getIdPersona().getNombre());
						obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
				}
				
				
			} catch (PersistentException e) {
				jsonText = null;
				e.printStackTrace();
			} catch (IOException e) {
				jsonText = null;
				e.printStackTrace();
			}

			return jsonText;
		}
	// ------------------------------------------------------------------------------------------------------------------
	public String buscarHoraApsPorMedico() {

		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		try {
			orm.Medico medicoOrm = orm.MedicoDAO.getMedicoByORMID(this.medico
					.getId());

			if(medicoOrm==null){
				
			}else{
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);
				
			for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
				this.aps = esAps(horaMedicaOrm.getAsp());
				// hay que probar que funcione
				if (aps == true
						&& horaMedicaOrm.getIdMedico().getMedico() == medicoOrm.getMedico()) {
					
					 //orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
					String fecha = obtenerFecha(horaMedicaOrm.getFecha());
					String hora = obtenerHora(horaMedicaOrm.getFecha());
					obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
					obj.put("fechaHoraMedica", fecha);
					obj.put("horaHoraMedica", hora);
					obj.put("nombreMedico",medicoOrm.getIdPersona().getNombre());
					obj.put("apellidoMedico", medicoOrm.getIdPersona().getApellidos());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
			}
			
			}
		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}
	// ------------------------------------------------------------------------------------------------------------------
		public String buscarHoraControlPorMedico() {

			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "";
			try {
				orm.Medico medicoOrm = orm.MedicoDAO.getMedicoByORMID(this.medico
						.getId());

				if(medicoOrm==null){
					
				}else{
				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);
					
				for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
					this.aps = esAps(horaMedicaOrm.getAsp());
					// hay que probar que funcione
					if (aps == false
							&& horaMedicaOrm.getIdMedico().getMedico() == medicoOrm.getMedico()) {
						
						 //orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
						String fecha = obtenerFecha(horaMedicaOrm.getFecha());
						String hora = obtenerHora(horaMedicaOrm.getFecha());
						obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
						obj.put("fechaHoraMedica", fecha);
						obj.put("horaHoraMedica", hora);
						obj.put("nombreMedico",medicoOrm.getIdPersona().getNombre());
						obj.put("apellidoMedico", medicoOrm.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
				}
				
				}
			} catch (PersistentException e) {
				jsonText = null;
				e.printStackTrace();
			} catch (IOException e) {
				jsonText = null;
				e.printStackTrace();
			}

			return jsonText;
		}
		// ------------------------------------------------------------------------------------------------------------------		
		public String buscarDisponibilidadDeHorarioPorFecha(String fechaInicio, String fechaFin) {
			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "";
			Transformar t=new Transformar();
			ArrayList<orm.HoraMedica> listaHoraMedicas = new ArrayList();
			try {				

				orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
						null, null);
				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);

				
				// --------------------
				boolean disponible = true;
				if (listaReservas.length > 0 && listaHorasMedicas.length > 0) {
					
					for (orm.HoraMedica horaMedica : listaHorasMedicas) {
						String fechaString=obtenerFecha(horaMedica.getFecha());	
						;
						if (t.compararFechas(fechaInicio, fechaFin,fechaString)) {
							for (orm.Reserva reserva : listaReservas) {

								if (horaMedica.getIdHora() == reserva.getIdHoraMedica().getIdHora()) {
									disponible = false;
									break;
								} else {
									disponible = true;
								}
							}

							if (disponible == true) {
								listaHoraMedicas.add(horaMedica);
							}
						}
					}
					
					for(orm.HoraMedica hMedica: listaHoraMedicas){
						orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(hMedica.getIdMedico().getMedico());
						 String hora = obtenerHora(hMedica.getFecha()); 
						 String fecha = obtenerFecha(hMedica.getFecha());
							obj.put("idHoraMedica", hMedica.getIdHora());
							obj.put("fechaHoraMedica", fecha);
							obj.put("horaHoraMedica", hora);
							obj.put("nombreMedico", medico.getIdPersona().getNombre());
							obj.put("apellidoMedico", medico.getIdPersona()
									.getApellidos());
							obj.put("tipoHora", hMedica.getAsp());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
					
							
					
				}

				// --------------------

		

			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				jsonText=null;
				e.printStackTrace();
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				jsonText=null;
				e.printStackTrace();
			}

			return jsonText;
		}
	// ------------------------------------------------------------------------------------------------------------------
		public String buscarHoraMedicaApsPorRango(String fechaInicio, String fechaFin) {
			Transformar t=new Transformar();
			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "no encontrado";

			try {
				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);
				if(listaHorasMedicas.length>0){
				for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
					this.aps = esAps(horaMedicaOrm.getAsp());
					// hay que probar que funcione					
					String fechaString=obtenerFecha(horaMedicaOrm.getFecha());									
					if (t.compararFechas(fechaInicio, fechaFin,fechaString)&&this.aps==true){
														
						 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
						String fecha = obtenerFecha(horaMedicaOrm.getFecha());
						String hora = obtenerHora(horaMedicaOrm.getFecha());
						obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
						obj.put("fechaHoraMedica", fecha);
						obj.put("horaHoraMedica", hora);
						obj.put("nombreMedico", medico.getIdPersona().getNombre());
						obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
					//jsonText=t.compararFechass(fechaInicio, fechaFin, fechaString);
				}
				
				}
			} catch (PersistentException e) {
				jsonText = "no encontrado";
				e.printStackTrace();
			} catch (IOException e) {
				jsonText = "no encontrado";
				e.printStackTrace();
			}

			return jsonText;
		}// ------------------------------------------------------------------------------------------------------------------
		public String buscarHoraMedicaControlPorRango(String fechaInicio, String fechaFin) {
			Transformar t=new Transformar();
			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "no encontrado";

			try {
				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);
				if(listaHorasMedicas.length>0){
				for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
					this.aps = esAps(horaMedicaOrm.getAsp());
					// hay que probar que funcione					
					String fechaString=obtenerFecha(horaMedicaOrm.getFecha());									
					if (t.compararFechas(fechaInicio, fechaFin,fechaString)&&this.aps==false){
														
						 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
						String fecha = obtenerFecha(horaMedicaOrm.getFecha());
						String hora = obtenerHora(horaMedicaOrm.getFecha());
						obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
						obj.put("fechaHoraMedica", fecha);
						obj.put("horaHoraMedica", hora);
						obj.put("nombreMedico", medico.getIdPersona().getNombre());
						obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
					//jsonText=t.compararFechass(fechaInicio, fechaFin, fechaString);
				}
				
				}
			} catch (PersistentException e) {
				jsonText = "no encontrado";
				e.printStackTrace();
			} catch (IOException e) {
				jsonText = "no encontrado";
				e.printStackTrace();
			}

			return jsonText;
		}
	// ------------------------------------------------------------------------------------------------------------------
	public String buscarHoraMedicaPorRango(String fechaInicio, String fechaFin) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		try {
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);

			for (orm.HoraMedica horaMedicaOrm : listaHorasMedicas) {
				String fechaString=obtenerFecha(horaMedicaOrm.getFecha());			
				if (t.compararFechas(fechaInicio, fechaFin,fechaString)) {
					 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedicaOrm.getIdMedico().getMedico());
					String fecha = obtenerFecha(horaMedicaOrm.getFecha());
					String hora = obtenerHora(horaMedicaOrm.getFecha());
					obj.put("idHoraMedica", horaMedicaOrm.getIdHora());
					obj.put("fechaHoraMedica", fecha);
					obj.put("horaHoraMedica", hora);
					obj.put("nombreMedico", medico.getIdPersona().getNombre());
					obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
			}
			

		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// ------------------------------------------------------------------------------------------------------------------
	public boolean esAps(String aps) {
		if (aps.equalsIgnoreCase("true") || aps.equalsIgnoreCase("false")) {
			return Boolean.parseBoolean(aps);
		}
		return false;
	}

	// ------------------------------------------------------------------------------------------------------------------
	public String obtenerFecha(Date fecha) {
		DateFormat fechaFormato = new SimpleDateFormat("yyyy-MM-dd");
		String convertido = fechaFormato.format(fecha);
		return convertido;
	}

	// ------------------------------------------------------------------------------------------------------------------
	public String obtenerHora(Date horas) {

		DateFormat hora = new SimpleDateFormat("HH:mm:ss");
		String convertido = hora.format(horas);
		return convertido;
	}
	// ------------------------------------------------------------------------------------------------------------------
	public String buscarDisponibilidadDeHorarioPorMedicoFecha(String fechaInicio, String fechaFin) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		ArrayList<orm.HoraMedica> listaHoraMedicas = new ArrayList();
		try {
			orm.Medico medico = orm.MedicoDAO.getMedicoByORMID(this.medico
					.getId());

			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);

			
			// --------------------
			boolean disponible = true;
			if (listaReservas.length > 0 && listaHorasMedicas.length > 0) {
				
				for (orm.HoraMedica horaMedica : listaHorasMedicas) {
					String fechaString=obtenerFecha(horaMedica.getFecha());	
					;
					if (horaMedica.getIdMedico().getMedico() == medico.getMedico()&&
							t.compararFechas(fechaInicio, fechaFin,fechaString)) {
						for (orm.Reserva reserva : listaReservas) {

							if (horaMedica.getIdHora() == reserva.getIdHoraMedica().getIdHora()) {
								disponible = false;
								break;
							} else {
								disponible = true;
							}
						}

						if (disponible == true) {
							listaHoraMedicas.add(horaMedica);
						}
					}
				}
				
				for(orm.HoraMedica hMedica: listaHoraMedicas){
					 String hora = obtenerHora(hMedica.getFecha()); 
					 String fecha = obtenerFecha(hMedica.getFecha());
						obj.put("idHoraMedica", hMedica.getIdHora());
						obj.put("fechaHoraMedica", fecha);
						obj.put("horaHoraMedica", hora);
						obj.put("nombreMedico", medico.getIdPersona().getNombre());
						obj.put("apellidoMedico", medico.getIdPersona()
								.getApellidos());
						obj.put("tipoHora", hMedica.getAsp());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
				
						
				
			}

			// --------------------

	

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText=null;
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			jsonText=null;
			e.printStackTrace();
		}

		return jsonText;
	}
	// ------------------------------------------------------------------------------------------------------------------
		public String buscarDisponibilidadDeHorario() {
			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "";
			Transformar t=new Transformar();
			ArrayList<orm.HoraMedica> listaHoraMedicas = new ArrayList();
			try {

				orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
						null, null);
				orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
						.listHoraMedicaByQuery(null, null);

				
				// --------------------
				boolean disponible = true;
				if (listaReservas.length > 0 && listaHorasMedicas.length > 0) {
					
					for (orm.HoraMedica horaMedica : listaHorasMedicas) {
						String fechaString=obtenerFecha(horaMedica.getFecha());	
							for (orm.Reserva reserva : listaReservas) {

								if (horaMedica.getIdHora() == reserva.getIdHoraMedica().getIdHora()) {
									disponible = false;
									break;
								} else {
									disponible = true;
								}
							}

							if (disponible == true) {
								listaHoraMedicas.add(horaMedica);
							}
						
					}
					
					for(orm.HoraMedica hMedica: listaHoraMedicas){
						orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(hMedica.getIdMedico().getMedico());
						 String hora = obtenerHora(hMedica.getFecha()); 
						 String fecha = obtenerFecha(hMedica.getFecha());
							obj.put("idHoraMedica", hMedica.getIdHora());
							obj.put("fechaHoraMedica", fecha);
							obj.put("horaHoraMedica", hora);
							obj.put("nombreMedico", medico.getIdPersona().getNombre());
							obj.put("apellidoMedico", medico.getIdPersona()
									.getApellidos());
							obj.put("tipoHora", hMedica.getAsp());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}
					
							
					
				}

				// --------------------

		

			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				jsonText=null;
				e.printStackTrace();
			} catch (IOException e) { 
				// TODO Auto-generated catch block
				jsonText=null;
				e.printStackTrace();
			}

			return jsonText;
		}

	// ------------------------------------------------------------------------------------------------------------------
	public String buscarDisponibilidadDeHorarioPorMedico() {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		ArrayList<orm.HoraMedica> listaHoraMedicas = new ArrayList();
		try {
			orm.Medico medico = orm.MedicoDAO.getMedicoByORMID(this.medico
					.getId());

			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);

			
			// --------------------
			boolean disponible = true;
			if (listaReservas.length > 0 && listaHorasMedicas.length > 0) {
				
				for (orm.HoraMedica horaMedica : listaHorasMedicas) {
					String fechaString=obtenerFecha(horaMedica.getFecha());	
					;
					if (horaMedica.getIdMedico().getMedico() == medico.getMedico()) {
						for (orm.Reserva reserva : listaReservas) {

							if (horaMedica.getIdHora() == reserva.getIdHoraMedica().getIdHora()) {
								disponible = false;
								break;
							} else {
								disponible = true;
							}
						}

						if (disponible == true) {
							listaHoraMedicas.add(horaMedica);
						}
					}
				}
				
				for(orm.HoraMedica hMedica: listaHoraMedicas){
					 String hora = obtenerHora(hMedica.getFecha()); 
					 String fecha = obtenerFecha(hMedica.getFecha());
					obj.put("idHoraMedica", hMedica.getIdHora());
					obj.put("fechaHoraMedica", fecha);
					obj.put("horaHoraMedica", hora);
					obj.put("nombreMedico", medico.getIdPersona().getNombre());
					obj.put("apellidoMedico", medico.getIdPersona()
							.getApellidos());
					obj.put("tipoHora", hMedica.getAsp());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
				
						
				
			}

			// --------------------

	

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText=null;
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			jsonText=null;
			e.printStackTrace();
		}

		return jsonText;
	}
	// ------------------------------------------------------------------------------------------------------------------
	
	
	public String obtenerListaHoras(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
	
		String jsonText = "";
		try {
			orm.HoraMedica[] listaHoras=orm.HoraMedicaDAO.listHoraMedicaByQuery(null, null);
			
			for(orm.HoraMedica horaMedica: listaHoras){
				 String hora = obtenerHora(horaMedica.getFecha()); 
				 String fecha = obtenerFecha(horaMedica.getFecha());
				 orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(horaMedica.getIdMedico().getMedico());
				obj.put("idHoraMedica",horaMedica.getIdHora());
				obj.put("fechaHoraMedica", fecha);				
				obj.put("horaHoraMedica", hora);
				obj.put("nombreMedico", medico.getIdPersona().getNombre());
				obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
				obj.writeJSONString(out);
				jsonText = out.toString();
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			jsonText=null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonText=null;
		}
		
		return jsonText;
	}
	public String buscarHoraMedicaApsPorMedico(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "no encontrado";
		try {
			orm.Medico medico=orm.MedicoDAO.getMedicoByORMID(this.medico.getId());
			
			if(medico!=null){
				orm.HoraMedica[] listaHoraMedica=orm.HoraMedicaDAO.listHoraMedicaByQuery(null, null);
				if(listaHoraMedica.length>0){
					for(orm.HoraMedica horaMedica:listaHoraMedica){
						if(horaMedica.getIdMedico().getMedico()==medico.getMedico()){
							String hora = obtenerHora(horaMedica.getFecha()); 
							 String fecha = obtenerFecha(horaMedica.getFecha());
							obj.put("idHoraMedica",horaMedica.getIdHora());
							obj.put("fechaHoraMedica", fecha);				
							obj.put("horaHoraMedica", hora);
							obj.put("nombreMedico", medico.getIdPersona().getNombre());
							obj.put("apellidoMedico", medico.getIdPersona().getApellidos());
							obj.writeJSONString(out);
							jsonText = out.toString();
						}
					}
					
				}
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonText = "no encontrado";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonText = "no encontrado";
		}
		
		return jsonText = "no encontrado";
	}
}
