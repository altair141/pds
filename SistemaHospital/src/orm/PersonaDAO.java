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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PersonaDAO {
	public static Persona loadPersonaByORMID(int idPersona) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadPersonaByORMID(session, idPersona);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int idPersona) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getPersonaByORMID(session, idPersona);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(int idPersona, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadPersonaByORMID(session, idPersona, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(int idPersona, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getPersonaByORMID(session, idPersona, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int idPersona) throws PersistentException {
		try {
			return (Persona) session.load(orm.Persona.class, new Integer(idPersona));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int idPersona) throws PersistentException {
		try {
			return (Persona) session.get(orm.Persona.class, new Integer(idPersona));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByORMID(PersistentSession session, int idPersona, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.load(orm.Persona.class, new Integer(idPersona), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona getPersonaByORMID(PersistentSession session, int idPersona, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Persona) session.get(orm.Persona.class, new Integer(idPersona), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryPersona(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersona(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona[] listPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersona(session, condition, orderBy, lockMode);
			return (Persona[]) list.toArray(new Persona[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadPersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static Persona loadPersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Persona[] personas = listPersonaByQuery(session, condition, orderBy, lockMode);
		if (personas != null && personas.length > 0)
			return personas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iteratePersonaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Persona as Persona");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Persona", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona createPersona() {
		return new orm.Persona();
	}
	
	public static boolean save(orm.Persona persona) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Persona persona) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona persona)throws PersistentException {
		try {
			if(persona.getPaciente() != null) {
				persona.getPaciente().setIdPersona(null);
			}
			
			if(persona.getDirectorHospital() != null) {
				persona.getDirectorHospital().setIdPersona(null);
			}
			
			if(persona.getMedico() != null) {
				persona.getMedico().setIdPersona(null);
			}
			
			orm.Reserva[] lReservas = persona.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].setIdPersonaRegistra(null);
			}
			return delete(persona);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Persona persona, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(persona.getPaciente() != null) {
				persona.getPaciente().setIdPersona(null);
			}
			
			if(persona.getDirectorHospital() != null) {
				persona.getDirectorHospital().setIdPersona(null);
			}
			
			if(persona.getMedico() != null) {
				persona.getMedico().setIdPersona(null);
			}
			
			orm.Reserva[] lReservas = persona.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].setIdPersonaRegistra(null);
			}
			try {
				session.delete(persona);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Persona persona) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Persona persona) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(persona);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Persona loadPersonaByCriteria(PersonaCriteria personaCriteria) {
		Persona[] personas = listPersonaByCriteria(personaCriteria);
		if(personas == null || personas.length == 0) {
			return null;
		}
		return personas[0];
	}
	
	public static Persona[] listPersonaByCriteria(PersonaCriteria personaCriteria) {
		return personaCriteria.listPersona();
	}
}
