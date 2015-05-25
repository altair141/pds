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

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPersona;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression rut;
	public final DateExpression fechaNacimiento;
	public final StringExpression direccion;
	public final StringExpression ciudad;
	public final StringExpression comuna;
	public final StringExpression provincia;
	public final StringExpression region;
	public final StringExpression estado;
	public final StringExpression telefono;
	public final StringExpression email;
	public final StringExpression celular;
	public final StringExpression nombreUsuario;
	public final StringExpression clave;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression directorHospitalId;
	public final AssociationExpression directorHospital;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final IntegerExpression reservaId;
	public final AssociationExpression reserva;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		idPersona = new IntegerExpression("idPersona", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		region = new StringExpression("region", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		clave = new StringExpression("clave", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.idPersona", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		directorHospitalId = new IntegerExpression("directorHospital.idPersona", this.getDetachedCriteria());
		directorHospital = new AssociationExpression("directorHospital", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.idPersona", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		reservaId = new IntegerExpression("reserva.idPersona", this.getDetachedCriteria());
		reserva = new AssociationExpression("reserva", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		idPersona = new IntegerExpression("idPersona", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		comuna = new StringExpression("comuna", this.getDetachedCriteria());
		provincia = new StringExpression("provincia", this.getDetachedCriteria());
		region = new StringExpression("region", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		clave = new StringExpression("clave", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.idPersona", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		directorHospitalId = new IntegerExpression("directorHospital.idPersona", this.getDetachedCriteria());
		directorHospital = new AssociationExpression("directorHospital", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.idPersona", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		reservaId = new IntegerExpression("reserva.idPersona", this.getDetachedCriteria());
		reserva = new AssociationExpression("reserva", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria createPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("paciente"));
	}
	
	public DirectorHospitalDetachedCriteria createDirectorHospitalCriteria() {
		return new DirectorHospitalDetachedCriteria(createCriteria("directorHospital"));
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("reserva"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

