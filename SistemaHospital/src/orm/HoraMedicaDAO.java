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

public class HoraMedicaDAO {
	public static HoraMedica loadHoraMedicaByORMID(int idHora) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadHoraMedicaByORMID(session, idHora);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica getHoraMedicaByORMID(int idHora) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getHoraMedicaByORMID(session, idHora);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByORMID(int idHora, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadHoraMedicaByORMID(session, idHora, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica getHoraMedicaByORMID(int idHora, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getHoraMedicaByORMID(session, idHora, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByORMID(PersistentSession session, int idHora) throws PersistentException {
		try {
			return (HoraMedica) session.load(orm.HoraMedica.class, new Integer(idHora));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica getHoraMedicaByORMID(PersistentSession session, int idHora) throws PersistentException {
		try {
			return (HoraMedica) session.get(orm.HoraMedica.class, new Integer(idHora));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByORMID(PersistentSession session, int idHora, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HoraMedica) session.load(orm.HoraMedica.class, new Integer(idHora), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica getHoraMedicaByORMID(PersistentSession session, int idHora, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HoraMedica) session.get(orm.HoraMedica.class, new Integer(idHora), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoraMedica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryHoraMedica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoraMedica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryHoraMedica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica[] listHoraMedicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listHoraMedicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica[] listHoraMedicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listHoraMedicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHoraMedica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.HoraMedica as HoraMedica");
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
	
	public static List queryHoraMedica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.HoraMedica as HoraMedica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HoraMedica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica[] listHoraMedicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHoraMedica(session, condition, orderBy);
			return (HoraMedica[]) list.toArray(new HoraMedica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica[] listHoraMedicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHoraMedica(session, condition, orderBy, lockMode);
			return (HoraMedica[]) list.toArray(new HoraMedica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadHoraMedicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadHoraMedicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		HoraMedica[] horaMedicas = listHoraMedicaByQuery(session, condition, orderBy);
		if (horaMedicas != null && horaMedicas.length > 0)
			return horaMedicas[0];
		else
			return null;
	}
	
	public static HoraMedica loadHoraMedicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		HoraMedica[] horaMedicas = listHoraMedicaByQuery(session, condition, orderBy, lockMode);
		if (horaMedicas != null && horaMedicas.length > 0)
			return horaMedicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHoraMedicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateHoraMedicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoraMedicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateHoraMedicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHoraMedicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.HoraMedica as HoraMedica");
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
	
	public static java.util.Iterator iterateHoraMedicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.HoraMedica as HoraMedica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HoraMedica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica createHoraMedica() {
		return new orm.HoraMedica();
	}
	
	public static boolean save(orm.HoraMedica horaMedica) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(horaMedica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.HoraMedica horaMedica) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(horaMedica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.HoraMedica horaMedica)throws PersistentException {
		try {
			if(horaMedica.getIdMedico() != null) {
				horaMedica.getIdMedico().horaMedica.remove(horaMedica);
			}
			
			if(horaMedica.getIdBox() != null) {
				horaMedica.getIdBox().horaMedica.remove(horaMedica);
			}
			
			if(horaMedica.getReserva() != null) {
				horaMedica.getReserva().setIdHoraMedica(null);
			}
			
			return delete(horaMedica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.HoraMedica horaMedica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(horaMedica.getIdMedico() != null) {
				horaMedica.getIdMedico().horaMedica.remove(horaMedica);
			}
			
			if(horaMedica.getIdBox() != null) {
				horaMedica.getIdBox().horaMedica.remove(horaMedica);
			}
			
			if(horaMedica.getReserva() != null) {
				horaMedica.getReserva().setIdHoraMedica(null);
			}
			
			try {
				session.delete(horaMedica);
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
	
	public static boolean refresh(orm.HoraMedica horaMedica) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(horaMedica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.HoraMedica horaMedica) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(horaMedica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HoraMedica loadHoraMedicaByCriteria(HoraMedicaCriteria horaMedicaCriteria) {
		HoraMedica[] horaMedicas = listHoraMedicaByCriteria(horaMedicaCriteria);
		if(horaMedicas == null || horaMedicas.length == 0) {
			return null;
		}
		return horaMedicas[0];
	}
	
	public static HoraMedica[] listHoraMedicaByCriteria(HoraMedicaCriteria horaMedicaCriteria) {
		return horaMedicaCriteria.listHoraMedica();
	}
}
