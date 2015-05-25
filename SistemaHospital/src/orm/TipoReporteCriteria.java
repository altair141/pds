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

public class TipoReporteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression tipo;
	public final CollectionExpression reporte;
	
	public TipoReporteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		tipo = new StringExpression("tipo", this);
		reporte = new CollectionExpression("ORM_Reporte", this);
	}
	
	public TipoReporteCriteria(PersistentSession session) {
		this(session.createCriteria(TipoReporte.class));
	}
	
	public TipoReporteCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public ReporteCriteria createReporteCriteria() {
		return new ReporteCriteria(createCriteria("ORM_Reporte"));
	}
	
	public TipoReporte uniqueTipoReporte() {
		return (TipoReporte) super.uniqueResult();
	}
	
	public TipoReporte[] listTipoReporte() {
		java.util.List list = super.list();
		return (TipoReporte[]) list.toArray(new TipoReporte[list.size()]);
	}
}

