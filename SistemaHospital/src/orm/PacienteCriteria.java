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

public class PacienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPaciente;
	public final IntegerExpression nroFichaMedica;
	public final IntegerExpression idPersonaId;
	public final AssociationExpression idPersona;
	public final CollectionExpression reserva;
	
	public PacienteCriteria(Criteria criteria) {
		super(criteria);
		idPaciente = new IntegerExpression("idPaciente", this);
		nroFichaMedica = new IntegerExpression("nroFichaMedica", this);
		idPersonaId = new IntegerExpression("idPersona.idPersona", this);
		idPersona = new AssociationExpression("idPersona", this);
		reserva = new CollectionExpression("ORM_Reserva", this);
	}
	
	public PacienteCriteria(PersistentSession session) {
		this(session.createCriteria(Paciente.class));
	}
	
	public PacienteCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createIdPersonaCriteria() {
		return new PersonaCriteria(createCriteria("idPersona"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("ORM_Reserva"));
	}
	
	public Paciente uniquePaciente() {
		return (Paciente) super.uniqueResult();
	}
	
	public Paciente[] listPaciente() {
		java.util.List list = super.list();
		return (Paciente[]) list.toArray(new Paciente[list.size()]);
	}
}

