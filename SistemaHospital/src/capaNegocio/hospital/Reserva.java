package capaNegocio.hospital;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

public class Reserva {
private int id;
	

	private HoraMedica horaMedica;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}


	public Reserva(int id, HoraMedica horaMedica) {
		super();
		this.id = id;

		this.horaMedica = horaMedica;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public HoraMedica getHoraMedica() {
		return horaMedica;
	}


	public void setHoraMedica(HoraMedica horaMedica) {
		this.horaMedica = horaMedica;
	}


	//---------------------------------------------------------------------------------------------------------------
	public String reservarHoraAPS(){
		
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
					
		try {
			
			orm.Reserva reserva=orm.ReservaDAO.createReserva();
			orm.HoraMedica horaMedicaOrm=orm.HoraMedicaDAO.getHoraMedicaByORMID(this.horaMedica.getId());
			orm.Paciente pacienteOrm=orm.PacienteDAO.getPacienteByORMID(this.horaMedica.getPaciente().getIdPaciente());			
			orm.Persona personaOrm=orm.PersonaDAO.getPersonaByORMID(this.horaMedica.getPersonaRegistra().getId());
			reserva.setIdHoraMedica(horaMedicaOrm);
			reserva.setIdPaciente(pacienteOrm);
			reserva.setIdPersonaRegistra(personaOrm);
		
			if(orm.ReservaDAO.save(reserva)){
				//se cambia el estado de la hora medica para que sea aos
				horaMedicaOrm.setAsp("true");				
				orm.HoraMedicaDAO.save(horaMedicaOrm);				
				
				obj.put("idHoraMedica", horaMedicaOrm.getIdHora());						
				obj.writeJSONString(out);
				jsonText = out.toString();
				
				return jsonText;
			} 
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			jsonText+=this.horaMedica.getId();
			return jsonText =null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return jsonText =null;
		}
		
		return jsonText;
		
	}
	
	//---------------------------------------------------------------------------------------------------------------
	
	public String reservarHoraControl(){
		
		orm.Reserva reserva=orm.ReservaDAO.createReserva();
		orm.HoraMedica horaMedicaOrm;
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
			try {
				horaMedicaOrm = orm.HoraMedicaDAO.getHoraMedicaByORMID(this.horaMedica.getId());
				orm.Paciente pacienteOrm=orm.PacienteDAO.getPacienteByORMID(this.horaMedica.getPaciente().getIdPaciente());			
				orm.Persona personaOrm=orm.PersonaDAO.getPersonaByORMID(this.horaMedica.getPersonaRegistra().getId());
				reserva.setIdHoraMedica(horaMedicaOrm);
				reserva.setIdPaciente(pacienteOrm);
				reserva.setIdPersonaRegistra(personaOrm);
				if(orm.ReservaDAO.save(reserva)){
					obj.put("idHoraMedica", horaMedicaOrm.getIdHora());						
					obj.writeJSONString(out);
					jsonText = out.toString();
					
					return jsonText;
				}
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return jsonText=null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return jsonText=null;
			}
			
	
		
		
		 return jsonText=null;
	}
	//---------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------
	
	
}
