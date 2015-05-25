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

public class TipoReporteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression tipo;
	public final CollectionExpression reporte;
	
	public TipoReporteDetachedCriteria() {
		super(orm.TipoReporte.class, orm.TipoReporteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		reporte = new CollectionExpression("ORM_Reporte", this.getDetachedCriteria());
	}
	
	public TipoReporteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TipoReporteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		reporte = new CollectionExpression("ORM_Reporte", this.getDetachedCriteria());
	}
	
	public ReporteDetachedCriteria createReporteCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_Reporte"));
	}
	
	public TipoReporte uniqueTipoReporte(PersistentSession session) {
		return (TipoReporte) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipoReporte[] listTipoReporte(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipoReporte[]) list.toArray(new TipoReporte[list.size()]);
	}
}

