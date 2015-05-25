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

public class DirectorHospital {
	public DirectorHospital() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_DIRECTORHOSPITAL_REPORTE) {
			return ORM_reporte;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private orm.Persona idPersona;
	
	private java.util.Set ORM_reporte = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setIdPersona(orm.Persona value) {
		if (this.idPersona != value) {
			orm.Persona lidPersona = this.idPersona;
			this.idPersona = value;
			if (value != null) {
				idPersona.setDirectorHospital(this);
			}
			if (lidPersona != null) {
				lidPersona.setDirectorHospital(null);
			}
		}
	}
	
	public orm.Persona getIdPersona() {
		return idPersona;
	}
	
	private void setORM_Reporte(java.util.Set value) {
		this.ORM_reporte = value;
	}
	
	private java.util.Set getORM_Reporte() {
		return ORM_reporte;
	}
	
	public final orm.ReporteSetCollection reporte = new orm.ReporteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DIRECTORHOSPITAL_REPORTE, orm.ORMConstants.KEY_REPORTE_IDDIRECTORHOSPITAL, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
