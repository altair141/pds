package capaNegocio.personas;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

import utilitario.Transformar;

public class Medico extends Persona {

	private int id;
	private Especialidad especialidad;


	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico(String rut, String nombre, String apellidos,
			Date fechaNacimiento, String direccion, String comuna,
			String provincia, String region, boolean estado, String email,
			int telefono, int celular, String nombreUsuario, String claveUsuario) {
		super(rut, nombre, apellidos, fechaNacimiento, direccion, comuna,
				provincia, region, estado, email, telefono, celular,
				nombreUsuario, claveUsuario);
		// TODO Auto-generated constructor stub
	}

	public Medico(int id, Especialidad especialidad) {
		super();
		this.id = id;
		this.especialidad = especialidad;
	}

	
	// ---------------------------------------------------------------------------------------
	public String obtenerMedicos(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		
		try {
			orm.Medico[] listaMedicos=orm.MedicoDAO.listMedicoByQuery(null, null);
			if(listaMedicos.length>0){
			for(orm.Medico medicoOrm:listaMedicos){
				Medico medicoNegocio=new Medico();
				medicoNegocio.setId(medicoOrm.getMedico());				
				if(verificarMedicoActivo(medicoNegocio)){
					orm.Especialidad especialidad=orm.EspecialidadDAO.getEspecialidadByORMID(medicoOrm.getEspecialidad().getId());
					
					obj.put("id", medicoOrm.getMedico());
					obj.put("nombre", medicoOrm.getIdPersona().getNombre());							
					obj.put("apellido",medicoOrm.getIdPersona().getApellidos());
					obj.put("idEspecialidad", medicoOrm.getEspecialidad().getId());
					obj.put("nombreEspecialidad", especialidad.getNombreEspecialidad());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
			}
			

			}
		} catch (PersistentException e) {
			jsonText="";
			e.printStackTrace();
		} catch (IOException e) {
		jsonText="";
			e.printStackTrace();
		}
		
	
		return jsonText;
	}
	
	// ---------------------------------------------------------------------------------------
		public String obtenerMedicosPorBusqueda(String busqueda){
			Transformar t=new Transformar();
			JSONObject obj = new JSONObject();
			StringWriter out = new StringWriter();
			String jsonText = "";
			
			try {
				orm.Medico[] listaMedicos=orm.MedicoDAO.listMedicoByQuery(null, null);
				if(listaMedicos.length>0){
				for(orm.Medico medicoOrm:listaMedicos){
					Medico medicoNegocio=new Medico();
					medicoNegocio.setId(medicoOrm.getMedico());				
					if(verificarMedicoActivo(medicoNegocio)){
						orm.Especialidad especialidad=orm.EspecialidadDAO.getEspecialidadByORMID(medicoOrm.getEspecialidad().getId());
						
						if(t.busquedaPorLetra(medicoOrm.getIdPersona().getNombre(), busqueda)||
								t.busquedaPorLetra(medicoOrm.getIdPersona().getApellidos(), busqueda)||
								t.busquedaPorLetra(especialidad.getNombreEspecialidad(), busqueda)){
							
						obj.put("id", medicoOrm.getMedico());
						obj.put("nombre", medicoOrm.getIdPersona().getNombre());							
						obj.put("apellido",medicoOrm.getIdPersona().getApellidos());
						obj.put("idEspecialidad", medicoOrm.getEspecialidad().getId());
						obj.put("nombreEspecialidad", especialidad.getNombreEspecialidad());
						obj.writeJSONString(out);
						jsonText = out.toString();
						}
					}
				}
				
				if(jsonText==""||jsonText.length()==0){
					return "no encontrado";
				}
				}
			} catch (PersistentException e) {
				jsonText="";
				e.printStackTrace();
			} catch (IOException e) {
			jsonText="";
				e.printStackTrace();
			}
			
		
			return jsonText;
		}
	
	// ---------------------------------------------------------------------------------------
	public String obtenerMedicosPorEspecialidad() {
		Medico medico=new Medico();
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		String retorna="";
		try {
			orm.Especialidad especialidadOrm = orm.EspecialidadDAO.getEspecialidadByORMID(this.especialidad.getId());
			// validacion para que solo funcione en caso de que exista la
			// especialidad con el id enviado
			if (especialidadOrm!=null) {

				orm.Medico[] listaMedicos = orm.MedicoDAO.listMedicoByQuery(
						null, null);
				if (listaMedicos.length > 0) {
					
						for (orm.Medico medicoOrm : listaMedicos) {
							medico.setId(medicoOrm.getMedico());
							if(verificarMedicoActivo(medico)){
							if (medicoOrm.getEspecialidad().getId() == especialidadOrm
									.getId()) {
								// agregar el id y el nombre +apellidos al json
								obj.put("id", medicoOrm.getMedico());
								obj.put("nombre", medicoOrm.getIdPersona().getNombre());							
								obj.put("apellido",medicoOrm.getIdPersona().getApellidos());
								obj.put("idEspecialidad", medicoOrm.getEspecialidad().getId());
								obj.put("nombreEspecialidad",especialidadOrm.getNombreEspecialidad());
								obj.writeJSONString(out);
								jsonText = out.toString();
								
							
							}
						}
					}
				}

				
			}

		} catch (PersistentException e) {
			 jsonText ="";
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 jsonText = "";
			e.printStackTrace();
		}

		return jsonText;
	}

	// ---------------------------------------------------------------------------------------
	public  boolean verificarMedicoActivo(Medico medico){
		boolean activo=false;	
		try {
			orm.Medico medicoOrm=orm.MedicoDAO.getMedicoByORMID(medico.getId());
			String stringToBoolean=medicoOrm.getIdPersona().getEstado();
			if(stringToBoolean.equalsIgnoreCase("true")||stringToBoolean.equalsIgnoreCase("false")){
				activo=Boolean.parseBoolean(stringToBoolean);
			}			
		} catch (PersistentException e) {
			activo=false;
			
		}				
		return activo; 
	}
public String obtenerMedicoPorId()	{
	JSONObject obj = new JSONObject();
	StringWriter out = new StringWriter();
	String jsonText = "";
	try{
		orm.Medico medicoOrm=orm.MedicoDAO.getMedicoByORMID(this.getId());
		orm.Especialidad especialidadOrm = orm.EspecialidadDAO.getEspecialidadByORMID(medicoOrm.getEspecialidad().getId());
		obj.put("id", medicoOrm.getMedico());
		obj.put("nombre", medicoOrm.getIdPersona().getNombre());							
		obj.put("apellido",medicoOrm.getIdPersona().getApellidos());
		obj.put("idEspecialidad", medicoOrm.getEspecialidad().getId());
		obj.put("nombreEspecialidad",especialidadOrm.getNombreEspecialidad());
		obj.writeJSONString(out);
		jsonText = out.toString();
		
	}catch(PersistentException e){
		e.printStackTrace(); 
		jsonText=null;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		jsonText=null;
	}
	return jsonText;
}

	// ---------------------------------------------------------------------------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

}
