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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReporteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression idDirectorHospitalId;
	public final AssociationExpression idDirectorHospital;
	public final DateExpression fecha;
	public final StringExpression resultado;
	public final IntegerExpression idTipoReporteId;
	public final AssociationExpression idTipoReporte;
	
	public ReporteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		idDirectorHospitalId = new IntegerExpression("idDirectorHospital.id", this);
		idDirectorHospital = new AssociationExpression("idDirectorHospital", this);
		fecha = new DateExpression("fecha", this);
		resultado = new StringExpression("resultado", this);
		idTipoReporteId = new IntegerExpression("idTipoReporte.id", this);
		idTipoReporte = new AssociationExpression("idTipoReporte", this);
	}
	
	public ReporteCriteria(PersistentSession session) {
		this(session.createCriteria(Reporte.class));
	}
	
	public ReporteCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public DirectorHospitalCriteria createIdDirectorHospitalCriteria() {
		return new DirectorHospitalCriteria(createCriteria("idDirectorHospital"));
	}
	
	public TipoReporteCriteria createIdTipoReporteCriteria() {
		return new TipoReporteCriteria(createCriteria("idTipoReporte"));
	}
	
	public Reporte uniqueReporte() {
		return (Reporte) super.uniqueResult();
	}
	
	public Reporte[] listReporte() {
		java.util.List list = super.list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

