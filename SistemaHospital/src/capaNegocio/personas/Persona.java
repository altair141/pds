package capaNegocio.personas;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

public class Persona {
	private int id;
	private String rut;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String direccion;
	private String comuna;
	private String provincia;
	private String region;
	private boolean estado;
	private String email;
	private int telefono;
	private int celular;
	private String nombreUsuario;
	private String claveUsuario;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	

	public Persona(String rut, String nombre, String apellidos,
			Date fechaNacimiento, String direccion, String comuna,
			String provincia, String region, boolean estado, String email,
			int telefono, int celular, String nombreUsuario, String claveUsuario) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.comuna = comuna;
		this.provincia = provincia;
		this.region = region;
		this.estado = estado;
		this.email = email;
		this.telefono = telefono;
		this.celular = celular;
		this.nombreUsuario = nombreUsuario;
		this.claveUsuario = claveUsuario;
	}


	public Persona(int id, String rut, String nombre, String apellidos,
			Date fechaNacimiento, String direccion, String comuna,
			String provincia, String region, boolean estado, String email,
			int telefono, int celular, String nombreUsuario, String claveUsuario) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.comuna = comuna;
		this.provincia = provincia;
		this.region = region;
		this.estado = estado;
		this.email = email;
		this.telefono = telefono;
		this.celular = celular;
		this.nombreUsuario = nombreUsuario;
		this.claveUsuario = claveUsuario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	
	public String login(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		try {
			orm.Persona[] listaPersonas=orm.PersonaDAO.listPersonaByQuery(null, null);
			orm.Medico[] listaMedicos=orm.MedicoDAO.listMedicoByQuery(null, null);
			orm.Paciente[] listaPacientes=orm.PacienteDAO.listPacienteByQuery(null, null);
			orm.DirectorHospital[] directores=orm.DirectorHospitalDAO.listDirectorHospitalByQuery(null, null);
			int id=0;
			orm.Persona per=new orm.Persona();
			for(orm.Persona persona: listaPersonas){
				if(persona.getNombreUsuario().equals(this.getNombreUsuario())&&persona.getClave().equals(this.getClaveUsuario())){
					id=persona.getIdPersona();
					per=persona;					
					break;
				}
			}
				for(orm.Paciente paciente:listaPacientes){
					if(paciente.getIdPersona().getIdPersona()==id){
						obj.put("id", per.getIdPersona());
						obj.put("nombre", per.getNombre());
						obj.put("nombreUsuario",per.getNombreUsuario() );
						obj.put("tipoUsuario", "paciente");
						obj.writeJSONString(out);
						jsonText = out.toString();
						break;
					}
				}
				for(orm.Medico medico:listaMedicos){
					if(medico.getIdPersona().getIdPersona()==id){
						obj.put("id", per.getIdPersona());
						obj.put("nombre", per.getNombre());
						obj.put("nombreUsuario",per.getNombreUsuario() );
						obj.put("tipoUsuario", "medico");
						obj.writeJSONString(out);
						jsonText = out.toString();
						break;
					}
				}
				for(orm.DirectorHospital director:directores){
					if(director.getIdPersona().getIdPersona()==id){
						obj.put("id", per.getIdPersona());
						obj.put("nombre", per.getNombre());
						obj.put("nombreUsuario",per.getNombreUsuario() );
						obj.put("tipoUsuario", "director");
						obj.writeJSONString(out);
						jsonText = out.toString();
						break;
					}
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
}
