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

public class Paciente {
	public Paciente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PACIENTE_RESERVA) {
			return ORM_reserva;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idPaciente;
	
	private int nroFichaMedica;
	
	private orm.Persona idPersona;
	
	private java.util.Set ORM_reserva = new java.util.HashSet();
	
	private void setIdPaciente(int value) {
		this.idPaciente = value;
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public int getORMID() {
		return getIdPaciente();
	}
	
	public void setNroFichaMedica(int value) {
		this.nroFichaMedica = value;
	}
	
	public int getNroFichaMedica() {
		return nroFichaMedica;
	}
	
	public void setIdPersona(orm.Persona value) {
		if (this.idPersona != value) {
			orm.Persona lidPersona = this.idPersona;
			this.idPersona = value;
			if (value != null) {
				idPersona.setPaciente(this);
			}
			if (lidPersona != null) {
				lidPersona.setPaciente(null);
			}
		}
	}
	
	public orm.Persona getIdPersona() {
		return idPersona;
	}
	
	private void setORM_Reserva(java.util.Set value) {
		this.ORM_reserva = value;
	}
	
	private java.util.Set getORM_Reserva() {
		return ORM_reserva;
	}
	
	public final orm.ReservaSetCollection reserva = new orm.ReservaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PACIENTE_RESERVA, orm.ORMConstants.KEY_RESERVA_IDPACIENTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPaciente());
	}
	
}
