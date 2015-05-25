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

public class DirectorHospitalCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression idPersonaId;
	public final AssociationExpression idPersona;
	public final CollectionExpression reporte;
	
	public DirectorHospitalCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		idPersonaId = new IntegerExpression("idPersona.idPersona", this);
		idPersona = new AssociationExpression("idPersona", this);
		reporte = new CollectionExpression("ORM_Reporte", this);
	}
	
	public DirectorHospitalCriteria(PersistentSession session) {
		this(session.createCriteria(DirectorHospital.class));
	}
	
	public DirectorHospitalCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createIdPersonaCriteria() {
		return new PersonaCriteria(createCriteria("idPersona"));
	}
	
	public ReporteCriteria createReporteCriteria() {
		return new ReporteCriteria(createCriteria("ORM_Reporte"));
	}
	
	public DirectorHospital uniqueDirectorHospital() {
		return (DirectorHospital) super.uniqueResult();
	}
	
	public DirectorHospital[] listDirectorHospital() {
		java.util.List list = super.list();
		return (DirectorHospital[]) list.toArray(new DirectorHospital[list.size()]);
	}
}

