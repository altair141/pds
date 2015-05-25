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

public class BoxCriteria extends AbstractORMCriteria {
	public final IntegerExpression idHabitacion;
	public final StringExpression nroHabitacion;
	public final StringExpression especialidad;
	public final CollectionExpression horaMedica;
	
	public BoxCriteria(Criteria criteria) {
		super(criteria);
		idHabitacion = new IntegerExpression("idHabitacion", this);
		nroHabitacion = new StringExpression("nroHabitacion", this);
		especialidad = new StringExpression("especialidad", this);
		horaMedica = new CollectionExpression("ORM_HoraMedica", this);
	}
	
	public BoxCriteria(PersistentSession session) {
		this(session.createCriteria(Box.class));
	}
	
	public BoxCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public HoraMedicaCriteria createHoraMedicaCriteria() {
		return new HoraMedicaCriteria(createCriteria("ORM_HoraMedica"));
	}
	
	public Box uniqueBox() {
		return (Box) super.uniqueResult();
	}
	
	public Box[] listBox() {
		java.util.List list = super.list();
		return (Box[]) list.toArray(new Box[list.size()]);
	}
}

