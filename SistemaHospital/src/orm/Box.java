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

public class Box {
	public Box() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_BOX_HORAMEDICA) {
			return ORM_horaMedica;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idHabitacion;
	
	private String nroHabitacion;
	
	private String especialidad;
	
	private java.util.Set ORM_horaMedica = new java.util.HashSet();
	
	private void setIdHabitacion(int value) {
		this.idHabitacion = value;
	}
	
	public int getIdHabitacion() {
		return idHabitacion;
	}
	
	public int getORMID() {
		return getIdHabitacion();
	}
	
	public void setNroHabitacion(String value) {
		this.nroHabitacion = value;
	}
	
	public String getNroHabitacion() {
		return nroHabitacion;
	}
	
	public void setEspecialidad(String value) {
		this.especialidad = value;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	private void setORM_HoraMedica(java.util.Set value) {
		this.ORM_horaMedica = value;
	}
	
	private java.util.Set getORM_HoraMedica() {
		return ORM_horaMedica;
	}
	
	public final orm.HoraMedicaSetCollection horaMedica = new orm.HoraMedicaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_BOX_HORAMEDICA, orm.ORMConstants.KEY_HORAMEDICA_IDBOX, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdHabitacion());
	}
	
}
