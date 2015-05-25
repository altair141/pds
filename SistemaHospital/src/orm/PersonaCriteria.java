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

public class PersonaCriteria extends AbstractORMCriteria {
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
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		idPersona = new IntegerExpression("idPersona", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		rut = new StringExpression("rut", this);
		fechaNacimiento = new DateExpression("fechaNacimiento", this);
		direccion = new StringExpression("direccion", this);
		ciudad = new StringExpression("ciudad", this);
		comuna = new StringExpression("comuna", this);
		provincia = new StringExpression("provincia", this);
		region = new StringExpression("region", this);
		estado = new StringExpression("estado", this);
		telefono = new StringExpression("telefono", this);
		email = new StringExpression("email", this);
		celular = new StringExpression("celular", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		clave = new StringExpression("clave", this);
		pacienteId = new IntegerExpression("paciente.idPersona", this);
		paciente = new AssociationExpression("paciente", this);
		directorHospitalId = new IntegerExpression("directorHospital.idPersona", this);
		directorHospital = new AssociationExpression("directorHospital", this);
		medicoId = new IntegerExpression("medico.idPersona", this);
		medico = new AssociationExpression("medico", this);
		reservaId = new IntegerExpression("reserva.idPersona", this);
		reserva = new AssociationExpression("reserva", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.AsddsapdsPersistentManager.instance().getSession());
	}
	
	public PacienteCriteria createPacienteCriteria() {
		return new PacienteCriteria(createCriteria("paciente"));
	}
	
	public DirectorHospitalCriteria createDirectorHospitalCriteria() {
		return new DirectorHospitalCriteria(createCriteria("directorHospital"));
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("medico"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("reserva"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

