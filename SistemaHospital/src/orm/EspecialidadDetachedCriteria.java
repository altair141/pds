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

public class EspecialidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreEspecialidad;
	public final CollectionExpression medico;
	
	public EspecialidadDetachedCriteria() {
		super(orm.Especialidad.class, orm.EspecialidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreEspecialidad = new StringExpression("nombreEspecialidad", this.getDetachedCriteria());
		medico = new CollectionExpression("ORM_Medico", this.getDetachedCriteria());
	}
	
	public EspecialidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EspecialidadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreEspecialidad = new StringExpression("nombreEspecialidad", this.getDetachedCriteria());
		medico = new CollectionExpression("ORM_Medico", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("ORM_Medico"));
	}
	
	public Especialidad uniqueEspecialidad(PersistentSession session) {
		return (Especialidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Especialidad[] listEspecialidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
	}
}

