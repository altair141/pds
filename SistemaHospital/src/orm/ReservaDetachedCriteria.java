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

public class ReservaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idReserva;
	public final IntegerExpression idPacienteId;
	public final AssociationExpression idPaciente;
	public final IntegerExpression idHoraMedicaId;
	public final AssociationExpression idHoraMedica;
	public final IntegerExpression idPersonaRegistraId;
	public final AssociationExpression idPersonaRegistra;
	
	public ReservaDetachedCriteria() {
		super(orm.Reserva.class, orm.ReservaCriteria.class);
		idReserva = new IntegerExpression("idReserva", this.getDetachedCriteria());
		idPacienteId = new IntegerExpression("idPaciente.idPaciente", this.getDetachedCriteria());
		idPaciente = new AssociationExpression("idPaciente", this.getDetachedCriteria());
		idHoraMedicaId = new IntegerExpression("idHoraMedica.idHora", this.getDetachedCriteria());
		idHoraMedica = new AssociationExpression("idHoraMedica", this.getDetachedCriteria());
		idPersonaRegistraId = new IntegerExpression("idPersonaRegistra.idPersona", this.getDetachedCriteria());
		idPersonaRegistra = new AssociationExpression("idPersonaRegistra", this.getDetachedCriteria());
	}
	
	public ReservaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ReservaCriteria.class);
		idReserva = new IntegerExpression("idReserva", this.getDetachedCriteria());
		idPacienteId = new IntegerExpression("idPaciente.idPaciente", this.getDetachedCriteria());
		idPaciente = new AssociationExpression("idPaciente", this.getDetachedCriteria());
		idHoraMedicaId = new IntegerExpression("idHoraMedica.idHora", this.getDetachedCriteria());
		idHoraMedica = new AssociationExpression("idHoraMedica", this.getDetachedCriteria());
		idPersonaRegistraId = new IntegerExpression("idPersonaRegistra.idPersona", this.getDetachedCriteria());
		idPersonaRegistra = new AssociationExpression("idPersonaRegistra", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria createIdPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("idPaciente"));
	}
	
	public HoraMedicaDetachedCriteria createIdHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("idHoraMedica"));
	}
	
	public PersonaDetachedCriteria createIdPersonaRegistraCriteria() {
		return new PersonaDetachedCriteria(createCriteria("idPersonaRegistra"));
	}
	
	public Reserva uniqueReserva(PersistentSession session) {
		return (Reserva) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva[] listReserva(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

