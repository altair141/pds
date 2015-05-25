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

public class MedicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression medico;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final IntegerExpression idPersonaId;
	public final AssociationExpression idPersona;
	public final CollectionExpression horaMedica;
	
	public MedicoDetachedCriteria() {
		super(orm.Medico.class, orm.MedicoCriteria.class);
		medico = new IntegerExpression("medico", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		idPersonaId = new IntegerExpression("idPersona.idPersona", this.getDetachedCriteria());
		idPersona = new AssociationExpression("idPersona", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_HoraMedica", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MedicoCriteria.class);
		medico = new IntegerExpression("medico", this.getDetachedCriteria());
		especialidadId = new IntegerExpression("especialidad.id", this.getDetachedCriteria());
		especialidad = new AssociationExpression("especialidad", this.getDetachedCriteria());
		idPersonaId = new IntegerExpression("idPersona.idPersona", this.getDetachedCriteria());
		idPersona = new AssociationExpression("idPersona", this.getDetachedCriteria());
		horaMedica = new CollectionExpression("ORM_HoraMedica", this.getDetachedCriteria());
	}
	
	public EspecialidadDetachedCriteria createEspecialidadCriteria() {
		return new EspecialidadDetachedCriteria(createCriteria("especialidad"));
	}
	
	public PersonaDetachedCriteria createIdPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("idPersona"));
	}
	
	public HoraMedicaDetachedCriteria createHoraMedicaCriteria() {
		return new HoraMedicaDetachedCriteria(createCriteria("ORM_HoraMedica"));
	}
	
	public Medico uniqueMedico(PersistentSession session) {
		return (Medico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medico[] listMedico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medico[]) list.toArray(new Medico[list.size()]);
	}
}

