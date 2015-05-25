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

public class MedicoDAO {
	public static Medico loadMedicoByORMID(int medico) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadMedicoByORMID(session, medico);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(int medico) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getMedicoByORMID(session, medico);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(int medico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadMedicoByORMID(session, medico, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(int medico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getMedicoByORMID(session, medico, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(PersistentSession session, int medico) throws PersistentException {
		try {
			return (Medico) session.load(orm.Medico.class, new Integer(medico));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(PersistentSession session, int medico) throws PersistentException {
		try {
			return (Medico) session.get(orm.Medico.class, new Integer(medico));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByORMID(PersistentSession session, int medico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico) session.load(orm.Medico.class, new Integer(medico), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico getMedicoByORMID(PersistentSession session, int medico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medico) session.get(orm.Medico.class, new Integer(medico), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryMedico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryMedico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico as Medico");
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
	
	public static List queryMedico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedico(session, condition, orderBy);
			return (Medico[]) list.toArray(new Medico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico[] listMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedico(session, condition, orderBy, lockMode);
			return (Medico[]) list.toArray(new Medico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Medico[] medicos = listMedicoByQuery(session, condition, orderBy);
		if (medicos != null && medicos.length > 0)
			return medicos[0];
		else
			return null;
	}
	
	public static Medico loadMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Medico[] medicos = listMedicoByQuery(session, condition, orderBy, lockMode);
		if (medicos != null && medicos.length > 0)
			return medicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico as Medico");
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
	
	public static java.util.Iterator iterateMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medico as Medico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico createMedico() {
		return new orm.Medico();
	}
	
	public static boolean save(orm.Medico medico) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Medico medico) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Medico medico)throws PersistentException {
		try {
			if(medico.getEspecialidad() != null) {
				medico.getEspecialidad().medico.remove(medico);
			}
			
			if(medico.getIdPersona() != null) {
				medico.getIdPersona().setMedico(null);
			}
			
			orm.HoraMedica[] lHoraMedicas = medico.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setIdMedico(null);
			}
			return delete(medico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Medico medico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(medico.getEspecialidad() != null) {
				medico.getEspecialidad().medico.remove(medico);
			}
			
			if(medico.getIdPersona() != null) {
				medico.getIdPersona().setMedico(null);
			}
			
			orm.HoraMedica[] lHoraMedicas = medico.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setIdMedico(null);
			}
			try {
				session.delete(medico);
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
	
	public static boolean refresh(orm.Medico medico) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Medico medico) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(medico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medico loadMedicoByCriteria(MedicoCriteria medicoCriteria) {
		Medico[] medicos = listMedicoByCriteria(medicoCriteria);
		if(medicos == null || medicos.length == 0) {
			return null;
		}
		return medicos[0];
	}
	
	public static Medico[] listMedicoByCriteria(MedicoCriteria medicoCriteria) {
		return medicoCriteria.listMedico();
	}
}
