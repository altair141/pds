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

public class BoxDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idHabitacion;
	public final StringExpression nroHabitacion;
	public final StringExpression especialidad;
	public final CollectionExpression horaMedica;
	
	public BoxDetachedCriteria() {
		super(orm.Box.class, orm.BoxCriteria.class);
		idHabitacion = new IntegerExpression("idHabitacion", this.getDetachedCriteria());
		nroHabitacion = new StringExpression("nroHabitacion", this.getDetachedCriteria());
		especialidad = new StringExpression("especialidad", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_HoraMedica", this.getDetachedCriteria());
	}
	
	public BoxDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.BoxCriteria.class);
		idHabitacion = new IntegerExpression("idHabitacion", this.getDetachedCriteria());
		nroHabitacion = new StringExpression("nroHabitacion", this.getDetachedCriteria());
		especialidad = new StringExpression("especialidad", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_HoraMedica", this.getDetachedCriteria());
	}
	
	public HoraMedicaDetachedCriteria createHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("ORM_HoraMedica"));
	}
	
	public Box uniqueBox(PersistentSession session) {
		return (Box) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Box[] listBox(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Box[]) list.toArray(new Box[list.size()]);
	}
}

