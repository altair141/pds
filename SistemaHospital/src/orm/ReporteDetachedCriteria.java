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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReporteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression idDirectorHospitalId;
	public final AssociationExpression idDirectorHospital;
	public final DateExpression fecha;
	public final StringExpression resultado;
	public final IntegerExpression idTipoReporteId;
	public final AssociationExpression idTipoReporte;
	
	public ReporteDetachedCriteria() {
		super(orm.Reporte.class, orm.ReporteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idDirectorHospitalId = new IntegerExpression("idDirectorHospital.id", this.getDetachedCriteria());
		idDirectorHospital = new AssociationExpression("idDirectorHospital", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		resultado = new StringExpression("resultado", this.getDetachedCriteria());
		idTipoReporteId = new IntegerExpression("idTipoReporte.id", this.getDetachedCriteria());
		idTipoReporte = new AssociationExpression("idTipoReporte", this.getDetachedCriteria());
	}
	
	public ReporteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ReporteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idDirectorHospitalId = new IntegerExpression("idDirectorHospital.id", this.getDetachedCriteria());
		idDirectorHospital = new AssociationExpression("idDirectorHospital", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		resultado = new StringExpression("resultado", this.getDetachedCriteria());
		idTipoReporteId = new IntegerExpression("idTipoReporte.id", this.getDetachedCriteria());
		idTipoReporte = new AssociationExpression("idTipoReporte", this.getDetachedCriteria());
	}
	
	public DirectorHospitalDetachedCriteria createIdDirectorHospitalCriteria() {
		return new DirectorHospitalDetachedCriteria(createCriteria("idDirectorHospital"));
	}
	
	public TipoReporteDetachedCriteria createIdTipoReporteCriteria() {
		return new TipoReporteDetachedCriteria(createCriteria("idTipoReporte"));
	}
	
	public Reporte uniqueReporte(PersistentSession session) {
		return (Reporte) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reporte[] listReporte(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

