/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Persona {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_RESERVA) {
			return ORM_reserva;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idPersona;
	
	private String nombre;
	
	private String apellidos;
	
	private String rut;
	
	private java.util.Date fechaNacimiento;
	
	private String direccion;
	
	private String ciudad;
	
	private String comuna;
	
	private String provincia;
	
	private String region;
	
	private String estado;
	
	private String telefono;
	
	private String email;
	
	private String celular;
	
	private String nombreUsuario;
	
	private String clave;
	
	private orm.Paciente paciente;
	
	private orm.DirectorHospital directorHospital;
	
	private orm.Medico medico;
	
	private java.util.Set ORM_reserva = new java.util.HashSet();
	
	private void setIdPersona(int value) {
		this.idPersona = value;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public int getORMID() {
		return getIdPersona();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setFechaNacimiento(java.util.Date value) {
		this.fechaNacimiento = value;
	}
	
	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setComuna(String value) {
		this.comuna = value;
	}
	
	public String getComuna() {
		return comuna;
	}
	
	public void setProvincia(String value) {
		this.provincia = value;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setRegion(String value) {
		this.region = value;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCelular(String value) {
		this.celular = value;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setClave(String value) {
		this.clave = value;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setPaciente(orm.Paciente value) {
		if (this.paciente != value) {
			orm.Paciente lpaciente = this.paciente;
			this.paciente = value;
			if (value != null) {
				paciente.setIdPersona(this);
			}
			if (lpaciente != null) {
				lpaciente.setIdPersona(null);
			}
		}
	}
	
	public orm.Paciente getPaciente() {
		return paciente;
	}
	
	public void setDirectorHospital(orm.DirectorHospital value) {
		if (this.directorHospital != value) {
			orm.DirectorHospital ldirectorHospital = this.directorHospital;
			this.directorHospital = value;
			if (value != null) {
				directorHospital.setIdPersona(this);
			}
			if (ldirectorHospital != null) {
				ldirectorHospital.setIdPersona(null);
			}
		}
	}
	
	public orm.DirectorHospital getDirectorHospital() {
		return directorHospital;
	}
	
	public void setMedico(orm.Medico value) {
		if (this.medico != value) {
			orm.Medico lmedico = this.medico;
			this.medico = value;
			if (value != null) {
				medico.setIdPersona(this);
			}
			if (lmedico != null) {
				lmedico.setIdPersona(null);
			}
		}
	}
	
	public orm.Medico getMedico() {
		return medico;
	}
	
	private void setORM_Reserva(java.util.Set value) {
		this.ORM_reserva = value;
	}
	
	private java.util.Set getORM_Reserva() {
		return ORM_reserva;
	}
	
	public final orm.ReservaSetCollection reserva = new orm.ReservaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_RESERVA, orm.ORMConstants.KEY_RESERVA_IDPERSONAREGISTRA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPersona());
	}
	
}
