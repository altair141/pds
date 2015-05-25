package capaNegocio.personas;

import java.util.Date;

import org.orm.PersistentException;

public class Director extends Persona{

	private int idDirector;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(int idDirector) {
		super();
		this.idDirector = idDirector;
	}

	public Director(String rut, String nombre, String apellidos,
			Date fechaNacimiento, String direccion, String comuna,
			String provincia, String region, boolean estado, String email,
			int telefono, int celular, String nombreUsuario, String claveUsuario) {
		super(rut, nombre, apellidos, fechaNacimiento, direccion, comuna, provincia,
				region, estado, email, telefono, celular, nombreUsuario, claveUsuario);
		// TODO Auto-generated constructor stub
	}

	public int getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
	}
	
	//------------------------------------------------------------------------------------
	
	public  boolean verificarDirector(Director director){
		boolean activo=false;
		try {
			orm.DirectorHospital directorOrm=orm.DirectorHospitalDAO.getDirectorHospitalByORMID(director.getIdDirector());
			String stringToBoolean=directorOrm.getIdPersona().getEstado();
			if(stringToBoolean.equalsIgnoreCase("true")||stringToBoolean.equalsIgnoreCase("false")){
				activo=Boolean.parseBoolean(stringToBoolean);
			}			
		} catch (PersistentException e) {
			activo=false;
			e.printStackTrace();
		}
		
		return activo;
	}
	
	//------------------------------------------------------------------------------------
	
}
