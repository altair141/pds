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

public class DirectorHospitalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression idPersonaId;
	public final AssociationExpression idPersona;
	public final CollectionExpression reporte;
	
	public DirectorHospitalDetachedCriteria() {
		super(orm.DirectorHospital.class, orm.DirectorHospitalCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idPersonaId = new IntegerExpression("idPersona.idPersona", this.getDetachedCriteria());
		idPersona = new AssociationExpression("idPersona", this.getDetachedCriteria());
		reporte = new CollectionExpression("ORM_Reporte", this.getDetachedCriteria());
	}
	
	public DirectorHospitalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DirectorHospitalCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idPersonaId = new IntegerExpression("idPersona.idPersona", this.getDetachedCriteria());
		idPersona = new AssociationExpression("idPersona", this.getDetachedCriteria());
		reporte = new CollectionExpression("ORM_Reporte", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createIdPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("idPersona"));
	}
	
	public ReporteDetachedCriteria createReporteCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_Reporte"));
	}
	
	public DirectorHospital uniqueDirectorHospital(PersistentSession session) {
		return (DirectorHospital) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DirectorHospital[] listDirectorHospital(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DirectorHospital[]) list.toArray(new DirectorHospital[list.size()]);
	}
}

