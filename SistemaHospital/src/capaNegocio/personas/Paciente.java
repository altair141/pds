package capaNegocio.personas;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

public class Paciente extends Persona{

	private int idPaciente;
	private int nroFichaMedica;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(int idPaciente, int nroFichaMedica) {
		super();
		this.idPaciente = idPaciente;
		this.nroFichaMedica = nroFichaMedica;
	}

	public Paciente(String rut, String nombre, String apellidos,
			Date fechaNacimiento, String direccion, String comuna,
			String provincia, String region, boolean estado, String email,
			int telefono, int celular, String nombreUsuario, String claveUsuario) {
		super(rut, nombre, apellidos, fechaNacimiento, direccion, comuna, provincia,
				region, estado, email, telefono, celular, nombreUsuario, claveUsuario);
		// TODO Auto-generated constructor stub
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getNroFichaMedica() {
		return nroFichaMedica;
	}

	public void setNroFichaMedica(int nroFichaMedica) {
		this.nroFichaMedica = nroFichaMedica;
	}
	
	//-------------------------------------------------------------------------------
	public static String obtenerListaPacientes(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		
		try {
			orm.Paciente[] listaPacientes= orm.PacienteDAO.listPacienteByQuery(null, null);
			if(listaPacientes.length>0){
				
				for(orm.Paciente paciente: listaPacientes){
					obj.put("id", paciente.getIdPaciente());
					obj.put("nombre", paciente.getIdPersona().getNombre()+" "+paciente.getIdPersona().getApellidos());
					obj.writeJSONString(out);
					jsonText = out.toString();
					
				}
			
				
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText =null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText =null;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return jsonText;
	}
	
	//-------------------------------------------------------------------------------
	public static boolean verificarPacienteActivo(Paciente paciente){
		boolean activo=false;
		try {
			orm.Paciente pacienteOrm=orm.PacienteDAO.getPacienteByORMID(paciente.getIdPaciente());
			String stringToBoolean=pacienteOrm.getIdPersona().getEstado();
			if(stringToBoolean.equalsIgnoreCase("true")||stringToBoolean.equalsIgnoreCase("false")){
				activo=Boolean.parseBoolean(stringToBoolean);
			}			
		} catch (PersistentException e) {
			activo=false;
			e.printStackTrace();
		}
		
		return activo;
	}
	
	
	//-------------------------------------------------------------------------------
}
