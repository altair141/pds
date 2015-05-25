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

public class DirectorHospitalDAO {
	public static DirectorHospital loadDirectorHospitalByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadDirectorHospitalByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital getDirectorHospitalByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getDirectorHospitalByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadDirectorHospitalByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital getDirectorHospitalByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getDirectorHospitalByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (DirectorHospital) session.load(orm.DirectorHospital.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital getDirectorHospitalByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (DirectorHospital) session.get(orm.DirectorHospital.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DirectorHospital) session.load(orm.DirectorHospital.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital getDirectorHospitalByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DirectorHospital) session.get(orm.DirectorHospital.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirectorHospital(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryDirectorHospital(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirectorHospital(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryDirectorHospital(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital[] listDirectorHospitalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listDirectorHospitalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital[] listDirectorHospitalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listDirectorHospitalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirectorHospital(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.DirectorHospital as DirectorHospital");
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
	
	public static List queryDirectorHospital(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.DirectorHospital as DirectorHospital");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DirectorHospital", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital[] listDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDirectorHospital(session, condition, orderBy);
			return (DirectorHospital[]) list.toArray(new DirectorHospital[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital[] listDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDirectorHospital(session, condition, orderBy, lockMode);
			return (DirectorHospital[]) list.toArray(new DirectorHospital[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadDirectorHospitalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadDirectorHospitalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DirectorHospital[] directorHospitals = listDirectorHospitalByQuery(session, condition, orderBy);
		if (directorHospitals != null && directorHospitals.length > 0)
			return directorHospitals[0];
		else
			return null;
	}
	
	public static DirectorHospital loadDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DirectorHospital[] directorHospitals = listDirectorHospitalByQuery(session, condition, orderBy, lockMode);
		if (directorHospitals != null && directorHospitals.length > 0)
			return directorHospitals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDirectorHospitalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateDirectorHospitalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorHospitalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateDirectorHospitalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.DirectorHospital as DirectorHospital");
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
	
	public static java.util.Iterator iterateDirectorHospitalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.DirectorHospital as DirectorHospital");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DirectorHospital", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital createDirectorHospital() {
		return new orm.DirectorHospital();
	}
	
	public static boolean save(orm.DirectorHospital directorHospital) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(directorHospital);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.DirectorHospital directorHospital) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(directorHospital);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.DirectorHospital directorHospital)throws PersistentException {
		try {
			if(directorHospital.getIdPersona() != null) {
				directorHospital.getIdPersona().setDirectorHospital(null);
			}
			
			orm.Reporte[] lReportes = directorHospital.reporte.toArray();
			for(int i = 0; i < lReportes.length; i++) {
				lReportes[i].setIdDirectorHospital(null);
			}
			return delete(directorHospital);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.DirectorHospital directorHospital, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(directorHospital.getIdPersona() != null) {
				directorHospital.getIdPersona().setDirectorHospital(null);
			}
			
			orm.Reporte[] lReportes = directorHospital.reporte.toArray();
			for(int i = 0; i < lReportes.length; i++) {
				lReportes[i].setIdDirectorHospital(null);
			}
			try {
				session.delete(directorHospital);
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
	
	public static boolean refresh(orm.DirectorHospital directorHospital) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(directorHospital);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.DirectorHospital directorHospital) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(directorHospital);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DirectorHospital loadDirectorHospitalByCriteria(DirectorHospitalCriteria directorHospitalCriteria) {
		DirectorHospital[] directorHospitals = listDirectorHospitalByCriteria(directorHospitalCriteria);
		if(directorHospitals == null || directorHospitals.length == 0) {
			return null;
		}
		return directorHospitals[0];
	}
	
	public static DirectorHospital[] listDirectorHospitalByCriteria(DirectorHospitalCriteria directorHospitalCriteria) {
		return directorHospitalCriteria.listDirectorHospital();
	}
}
