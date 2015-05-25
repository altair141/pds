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

public class Reserva {
	public Reserva() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_IDHORAMEDICA) {
			this.idHoraMedica = (orm.HoraMedica) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_IDPACIENTE) {
			this.idPaciente = (orm.Paciente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_IDPERSONAREGISTRA) {
			this.idPersonaRegistra = (orm.Persona) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idReserva;
	
	private orm.Paciente idPaciente;
	
	private orm.HoraMedica idHoraMedica;
	
	private orm.Persona idPersonaRegistra;
	
	private void setIdReserva(int value) {
		this.idReserva = value;
	}
	
	public int getIdReserva() {
		return idReserva;
	}
	
	public int getORMID() {
		return getIdReserva();
	}
	
	public void setIdHoraMedica(orm.HoraMedica value) {
		if (this.idHoraMedica != value) {
			orm.HoraMedica lidHoraMedica = this.idHoraMedica;
			this.idHoraMedica = value;
			if (value != null) {
				idHoraMedica.setReserva(this);
			}
			if (lidHoraMedica != null) {
				lidHoraMedica.setReserva(null);
			}
		}
	}
	
	public orm.HoraMedica getIdHoraMedica() {
		return idHoraMedica;
	}
	
	public void setIdPaciente(orm.Paciente value) {
		if (idPaciente != null) {
			idPaciente.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public orm.Paciente getIdPaciente() {
		return idPaciente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdPaciente(orm.Paciente value) {
		this.idPaciente = value;
	}
	
	private orm.Paciente getORM_IdPaciente() {
		return idPaciente;
	}
	
	public void setIdPersonaRegistra(orm.Persona value) {
		if (this.idPersonaRegistra != value) {
			orm.Persona lidPersonaRegistra = this.idPersonaRegistra;
			this.idPersonaRegistra = value;
			if (value != null) {
				idPersonaRegistra.setReserva(this);
			}
			if (lidPersonaRegistra != null) {
				lidPersonaRegistra.setReserva(null);
			}
		}
	}
	
	public orm.Persona getIdPersonaRegistra() {
		return idPersonaRegistra;
	}
	
	public String toString() {
		return String.valueOf(getIdReserva());
	}
	
}
