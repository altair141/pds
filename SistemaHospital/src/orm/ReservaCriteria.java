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

public class ReservaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idReserva;
	public final IntegerExpression idPacienteId;
	public final AssociationExpression idPaciente;
	public final IntegerExpression idHoraMedicaId;
	public final AssociationExpression idHoraMedica;
	public final IntegerExpression idPersonaRegistraId;
	public final AssociationExpression idPersonaRegistra;
	
	public ReservaCriteria(Criteria criteria) {
		super(criteria);
		idReserva = new IntegerExpression("idReserva", this);
		idPacienteId = new IntegerExpression("idPaciente.idPaciente", this);
		idPaciente = new AssociationExpression("idPaciente", this);
		idHoraMedicaId = new IntegerExpression("idHoraMedica.idHora", this);
		idHoraMedica = new AssociationExpression("idHoraMedica", this);
		idPersonaRegistraId = new IntegerExpression("idPersonaRegistra.idPersona", this);
		idPersonaRegistra = new AssociationExpression("idPersonaRegistra", this);
	}
	
	public ReservaCriteria(PersistentSession session) {
		this(session.createCriteria(Reserva.class));
	}
	
	public ReservaCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public PacienteCriteria createIdPacienteCriteria() {
		return new PacienteCriteria(createCriteria("idPaciente"));
	}
	
	public HoraMedicaCriteria createIdHoraMedicaCriteria() {
		return new HoraMedicaCriteria(createCriteria("idHoraMedica"));
	}
	
	public PersonaCriteria createIdPersonaRegistraCriteria() {
		return new PersonaCriteria(createCriteria("idPersonaRegistra"));
	}
	
	public Reserva uniqueReserva() {
		return (Reserva) super.uniqueResult();
	}
	
	public Reserva[] listReserva() {
		java.util.List list = super.list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

