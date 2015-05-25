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

public class Reporte {
	public Reporte() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_REPORTE_IDTIPOREPORTE) {
			this.idTipoReporte = (orm.TipoReporte) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_REPORTE_IDDIRECTORHOSPITAL) {
			this.idDirectorHospital = (orm.DirectorHospital) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.DirectorHospital idDirectorHospital;
	
	private java.util.Date fecha;
	
	private String resultado;
	
	private orm.TipoReporte idTipoReporte;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setResultado(String value) {
		this.resultado = value;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setIdTipoReporte(orm.TipoReporte value) {
		if (idTipoReporte != null) {
			idTipoReporte.reporte.remove(this);
		}
		if (value != null) {
			value.reporte.add(this);
		}
	}
	
	public orm.TipoReporte getIdTipoReporte() {
		return idTipoReporte;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdTipoReporte(orm.TipoReporte value) {
		this.idTipoReporte = value;
	}
	
	private orm.TipoReporte getORM_IdTipoReporte() {
		return idTipoReporte;
	}
	
	public void setIdDirectorHospital(orm.DirectorHospital value) {
		if (idDirectorHospital != null) {
			idDirectorHospital.reporte.remove(this);
		}
		if (value != null) {
			value.reporte.add(this);
		}
	}
	
	public orm.DirectorHospital getIdDirectorHospital() {
		return idDirectorHospital;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdDirectorHospital(orm.DirectorHospital value) {
		this.idDirectorHospital = value;
	}
	
	private orm.DirectorHospital getORM_IdDirectorHospital() {
		return idDirectorHospital;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
