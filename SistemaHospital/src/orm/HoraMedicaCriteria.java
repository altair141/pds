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

public class HoraMedicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idHora;
	public final IntegerExpression idMedicoId;
	public final AssociationExpression idMedico;
	public final IntegerExpression idBoxId;
	public final AssociationExpression idBox;
	public final StringExpression asp;
	public final TimestampExpression fecha;
	public final IntegerExpression reservaId;
	public final AssociationExpression reserva;
	
	public HoraMedicaCriteria(Criteria criteria) {
		super(criteria);
		idHora = new IntegerExpression("idHora", this);
		idMedicoId = new IntegerExpression("idMedico.medico", this);
		idMedico = new AssociationExpression("idMedico", this);
		idBoxId = new IntegerExpression("idBox.idHabitacion", this);
		idBox = new AssociationExpression("idBox", this);
		asp = new StringExpression("asp", this);
		fecha = new TimestampExpression("fecha", this);
		reservaId = new IntegerExpression("reserva.idHora", this);
		reserva = new AssociationExpression("reserva", this);
	}
	
	public HoraMedicaCriteria(PersistentSession session) {
		this(session.createCriteria(HoraMedica.class));
	}
	
	public HoraMedicaCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public MedicoCriteria createIdMedicoCriteria() {
		return new MedicoCriteria(createCriteria("idMedico"));
	}
	
	public BoxCriteria createIdBoxCriteria() {
		return new BoxCriteria(createCriteria("idBox"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("reserva"));
	}
	
	public HoraMedica uniqueHoraMedica() {
		return (HoraMedica) super.uniqueResult();
	}
	
	public HoraMedica[] listHoraMedica() {
		java.util.List list = super.list();
		return (HoraMedica[]) list.toArray(new HoraMedica[list.size()]);
	}
}

