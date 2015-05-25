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

public class Especialidad {
	public Especialidad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO) {
			return ORM_medico;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombreEspecialidad;
	
	private java.util.Set ORM_medico = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombreEspecialidad(String value) {
		this.nombreEspecialidad = value;
	}
	
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}
	
	private void setORM_Medico(java.util.Set value) {
		this.ORM_medico = value;
	}
	
	private java.util.Set getORM_Medico() {
		return ORM_medico;
	}
	
	public final orm.MedicoSetCollection medico = new orm.MedicoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO, orm.ORMConstants.KEY_MEDICO_ESPECIALIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
